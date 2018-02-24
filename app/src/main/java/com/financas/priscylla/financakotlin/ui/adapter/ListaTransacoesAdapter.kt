package com.financas.priscylla.financakotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.financas.priscylla.financakotlin.R

/**
 * Created by priscylla on 15/02/18.
 */


class ListaTransacoesAdapter(transacoes: List<String>,
                             context: Context):BaseAdapter(){
    private val transacoes = transacoes
    private val context = context


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

    }

    override fun getItem(position: Int): Any {
        return transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return transacoes.size
    }

}