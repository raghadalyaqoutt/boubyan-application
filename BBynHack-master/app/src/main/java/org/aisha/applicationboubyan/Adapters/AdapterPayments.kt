package org.aisha.applicationboubyan.Adapters

import android.widget.BaseAdapter
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_payment.view.*
import org.aisha.applicationboubyan.MainActivity
import org.aisha.applicationboubyan.R
import org.aisha.applicationboubyan.model.payments

class AdapterPayments(var list:List<payments>, var activity: MainActivity): BaseAdapter() {


    override fun getView(pos: Int, convertView: View?, parent: ViewGroup?): View {
        var v = activity.layoutInflater.inflate(R.layout.list_item_payment,null)

        var paymentsData = list.get(pos)


        var vTitle= v.findViewById<TextView>(R.id.textViewName)
        vTitle.text = paymentsData.name

        var vDescription : TextView = v.findViewById<TextView>(R.id.textViewAmount)
        vDescription.text = paymentsData.amount

        Picasso.get().load( list[pos].image).into(v.paymentsImage)

        return v
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list.size
    }
}