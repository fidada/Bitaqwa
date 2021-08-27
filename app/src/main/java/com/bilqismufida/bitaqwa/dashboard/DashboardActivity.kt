package com.bilqismufida.bitaqwa.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bilqismufida.bitaqwa.R
import com.bilqismufida.bitaqwa.dashboard.adapter.InspirationListAdapter
import com.bilqismufida.bitaqwa.dashboard.data.InspirationData
import com.bilqismufida.bitaqwa.dashboard.model.InspirationModel
import com.bilqismufida.bitaqwa.menus.doa.MenuDoaActivity
import com.bilqismufida.bitaqwa.menus.dzikir.MenuDzikirActivity
import com.bilqismufida.bitaqwa.menus.jadwalsholat.MenuJadwalSholatActivity
import com.bilqismufida.bitaqwa.menus.videokajian.MenuVideoKajianActivity
import com.bilqismufida.bitaqwa.menus.zakat.MenuZakatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initNavMenu()
        initHeader()
        initRecycleViewInspiration()
    }

    private fun initRecycleViewInspiration() {
        val list : ArrayList<InspirationModel> = arrayListOf()
        rv_inspiration.setHasFixedSize(true)
        list.addAll(InspirationData.listData)

        rv_inspiration.layoutManager = LinearLayoutManager(this)
        val listInspirationAdapter = InspirationListAdapter(list)
        rv_inspiration.adapter = listInspirationAdapter
    }

    private fun initHeader() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH")
        val time = timeFormat.format(timeNow.time)

        when{
            time.toInt() in 0..6 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }

            time.toInt() in 7..12 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_morning)
            }

            time.toInt() in 13..18 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_afternoon)
            }

            time.toInt() in 19..23 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
        }
    }

    private fun initNavMenu() {
        iv_icon_menu_doa.setOnClickListener {
            startActivity(Intent(this, MenuDoaActivity::class.java))
        }

        iv_icon_menu_dzikir.setOnClickListener {
            startActivity(Intent(this, MenuDzikirActivity::class.java))
        }

        iv_icon_menu_jadwal_sholat.setOnClickListener {
            startActivity(Intent(this, MenuJadwalSholatActivity::class.java))
        }

        iv_icon_menu_video_kajian.setOnClickListener {
            startActivity(Intent(this, MenuVideoKajianActivity::class.java))
        }

        iv_icon_menu_zakat.setOnClickListener {
            startActivity(Intent(this, MenuZakatActivity::class.java))
        }
    }
}