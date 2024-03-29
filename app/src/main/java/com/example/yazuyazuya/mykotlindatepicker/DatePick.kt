package com.example.yazuyazuya.mykotlindatepicker

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import java.util.Calendar

class DatePick : DialogFragment(), DatePickerDialog.OnDateSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(
                activity,
                activity as MainActivity?,
                year,
                month,
                day)
    }

    override fun onDateSet(view: android.widget.DatePicker, year: Int,
                           monthOfYear: Int, dayOfMonth: Int) {
    }

}