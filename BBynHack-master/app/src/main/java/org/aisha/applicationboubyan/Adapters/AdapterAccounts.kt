package org.aisha.applicationboubyan.Adapters

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_accounts.view.*
import org.aisha.applicationboubyan.MainActivity
import org.aisha.applicationboubyan.R
import org.aisha.applicationboubyan.model.accounts

class AdapterAccounts(var list:List<accounts>, var activity: MainActivity): BaseAdapter() {


    override fun getView(pos: Int, convertView: View?, parent: ViewGroup?): View {
        var v = activity.layoutInflater.inflate(R.layout.list_item_accounts,null)

        var accountsData = list.get(pos)


        var vUsername= v.findViewById<TextView>(R.id.UserName)
        vUsername.text = accountsData.username

        var vAccountNum : TextView = v.findViewById<TextView>(R.id.textAcctNum)
        vAccountNum.text = accountsData.acountNum

        Picasso.get().load( list[pos].image).into(v.imageViewCard)

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