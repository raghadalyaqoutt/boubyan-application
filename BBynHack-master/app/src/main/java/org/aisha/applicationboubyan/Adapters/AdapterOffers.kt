package org.aisha.applicationboubyan.Adapters

import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_offer.view.*
import org.aisha.applicationboubyan.MainActivity
import org.aisha.applicationboubyan.R
import org.aisha.applicationboubyan.model.offer
import com.squareup.picasso.Picasso


class AdapterOffers(var list:List<offer>, var activity: MainActivity): BaseAdapter() {


    override fun getView(pos: Int, convertView: View?, parent: ViewGroup?): View {
        var v = activity.layoutInflater.inflate(R.layout.list_offer,null)

        var offerData = list.get(pos)


        v.imageViewLocation.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:0,0?q=${list[pos].lat},${list[pos].long}(${list[pos].name})" )
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(v.context.packageManager) != null) {
                v.context.startActivity(mapIntent)
            }
        }


        var vTitle= v.findViewById<TextView>(R.id.eventTitle)
        vTitle.text = offerData.title

        var vDescription : TextView = v.findViewById<TextView>(R.id.eventDescription)
        vDescription.text = offerData.Description

        var vLocation : TextView = v.findViewById<TextView>(R.id.Location)
        vLocation.text = offerData.location

        var vCloseH = v.findViewById<TextView>(R.id.CloseH)
        vCloseH.text = offerData.close_hour

        var vOpenH =  v.findViewById<TextView>(R.id.OperH)
        vOpenH.text = "Oping Hours: " + offerData.open_hour + " - "

        Picasso.get().load( list[pos].image).into(v.eventImage)


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