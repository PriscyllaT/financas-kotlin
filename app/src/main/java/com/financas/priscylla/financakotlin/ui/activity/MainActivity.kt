package com.financas.priscylla.financakotlin.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.financas.priscylla.financakotlin.R
import com.financas.priscylla.financakotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val trasacoes = listOf("Joana - 3.000", "Paulo - 2.011")

        val arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, trasacoes)

        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(trasacoes,this))

    }
}
