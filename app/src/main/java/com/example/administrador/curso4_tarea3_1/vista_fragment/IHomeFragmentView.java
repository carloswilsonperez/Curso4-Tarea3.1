package com.example.administrador.curso4_tarea3_1.vista_fragment;

import com.example.administrador.curso4_tarea3_1.adapter.MascotaAdaptador;
import com.example.administrador.curso4_tarea3_1.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by administrador on 27/05/17.
 */

public interface IHomeFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
