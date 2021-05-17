package com.life360.vbsample.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.life360.vbsample.databinding.EmployeeItemBinding
import com.life360.vbsample.models.Employee

class EmployeeAdapter(private val employees: List<Employee>): RecyclerView.Adapter<EmployeeViewHolder>() {

    private lateinit var binding: EmployeeItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        binding = EmployeeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmployeeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        return holder.bind(employees[position])
    }
}

class EmployeeViewHolder(binding: EmployeeItemBinding): RecyclerView.ViewHolder(binding.root){
    private var holderBinding = binding

    fun bind(employee: Employee) {
        Log.d("ADAPTER", employee.employeeId.toString())
        holderBinding.tvEmpId.text = employee.employeeId.toString()
        holderBinding.tvFirstName.text = employee.firstName
        holderBinding.tvLastName.text = employee.lastName
        holderBinding.tvEmail.text = employee.email
        holderBinding.tvHireDate.text = employee.hireDate
    }

}

