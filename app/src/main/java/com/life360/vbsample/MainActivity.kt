package com.life360.vbsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.life360.vbsample.adapter.EmployeeAdapter
import com.life360.vbsample.databinding.ActivityMainBinding
import com.life360.vbsample.models.Employee

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.subLayout.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = EmployeeAdapter(createEmployeeList())
        }
    }

    fun createEmployeeList(): List<Employee> {
        val employeeList: MutableList<Employee> = mutableListOf()

        var emp = Employee(
            100,
            "John",
            "Chen",
            "john.chen@xxxx.com",
            "2008-10-16"
        )
        employeeList.add(emp)

        emp = Employee(
            101,
            "Ameya",
            "Job",
            "ameya.job@xxx.com",
            "2013-03-06"
        )
        employeeList.add(emp)

        emp = Employee(
            102,
            "Pat",
            "Fay",
            "pat.fey@xxx.com",
            "2001-03-06"
        )
        employeeList.add(emp)

        return employeeList
    }
}
