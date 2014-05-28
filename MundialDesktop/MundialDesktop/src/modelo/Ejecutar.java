/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import crud.DaoEquipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elivar
 */
public class Ejecutar {

    public void ejecutar() throws Exception {

        List<Team> teams = new ArrayList<Team>();
        Team espania = new Team();
        espania.setNombrePais("España");
        espania.setNumeroCopasGanadas(1);
        espania.setPosFifa(1);
        espania.setGrupo("B");
        espania.setpUno(1);
        espania.setpDos(2);
        espania.setpTres(3);
        teams.add(espania);

        Team croacia = new Team();
        croacia.setNombrePais("Croacia");
        croacia.setNumeroCopasGanadas(0);
        croacia.setPosFifa(20);
        croacia.setGrupo("A");
        croacia.setpUno(1);
        croacia.setpDos(3);
        croacia.setpTres(2);
        teams.add(croacia);

        Team italia = new Team();
        italia.setNombrePais("Italia");
        italia.setNumeroCopasGanadas(4);
        italia.setPosFifa(9);
        italia.setGrupo("D");
        italia.setpUno(3);
        italia.setpDos(3);
        italia.setpTres(1);
        teams.add(italia);

        Team holanda = new Team();
        holanda.setNombrePais("Holanda");
        holanda.setNumeroCopasGanadas(0);
        holanda.setPosFifa(15);
        holanda.setGrupo("B");
        holanda.setpUno(1);
        holanda.setpDos(2);
        holanda.setpTres(2);
        teams.add(holanda);

        Team belgica = new Team();
        belgica.setNombrePais("Bélgica");
        belgica.setNumeroCopasGanadas(0);
        belgica.setPosFifa(12);
        belgica.setGrupo("H");
        belgica.setpUno(1);
        belgica.setpDos(1);
        belgica.setpTres(3);
        teams.add(belgica);

        Team alemania = new Team();
        alemania.setNombrePais("Alemania");
        alemania.setNumeroCopasGanadas(3);
        alemania.setPosFifa(2);
        alemania.setGrupo("G");
        alemania.setpUno(1);
        alemania.setpDos(3);
        alemania.setpTres(2);
        teams.add(alemania);

        Team suiza = new Team();
        suiza.setNombrePais("Suiza");
        suiza.setNumeroCopasGanadas(0);
        suiza.setPosFifa(8);
        suiza.setGrupo("E");
        suiza.setpUno(1);
        suiza.setpDos(2);
        suiza.setpTres(3);
        teams.add(suiza);

        Team rusia = new Team();
        rusia.setNombrePais("Rusia");
        rusia.setNumeroCopasGanadas(0);
        rusia.setPosFifa(18);
        rusia.setGrupo("H");
        rusia.setpUno(1);
        rusia.setpDos(2);
        rusia.setpTres(3);
        teams.add(rusia);

        Team bosnia = new Team();
        bosnia.setNombrePais("Bosnia");
        bosnia.setNumeroCopasGanadas(0);
        bosnia.setPosFifa(25);
        bosnia.setGrupo("F");
        bosnia.setpUno(3);
        bosnia.setpDos(1);
        bosnia.setpTres(1);
        teams.add(bosnia);

        Team inglaterra = new Team();
        inglaterra.setNombrePais("Inglaterra");
        inglaterra.setNumeroCopasGanadas(1);
        inglaterra.setPosFifa(11);
        inglaterra.setGrupo("D");
        inglaterra.setpUno(2);
        inglaterra.setpDos(2);
        inglaterra.setpTres(2);
        teams.add(inglaterra);

        Team portugal = new Team();
        portugal.setNombrePais("Portugal");
        portugal.setNumeroCopasGanadas(0);
        portugal.setPosFifa(3);
        portugal.setGrupo("G");
        portugal.setpUno(1);
        portugal.setpDos(3);
        portugal.setpTres(1);
        teams.add(portugal);

        Team grecia = new Team();
        grecia.setNombrePais("Grecia");
        grecia.setNumeroCopasGanadas(0);
        grecia.setPosFifa(10);
        grecia.setGrupo("C");
        grecia.setpUno(3);
        grecia.setpDos(3);
        grecia.setpTres(1);
        teams.add(grecia);

        Team francia = new Team();
        francia.setNombrePais("Francia");
        francia.setNumeroCopasGanadas(1);
        francia.setPosFifa(16);
        francia.setGrupo("E");
        francia.setpUno(3);
        francia.setpDos(3);
        francia.setpTres(1);
        teams.add(francia);

        Team estadosUnidos = new Team();
        estadosUnidos.setNombrePais("Estados Unidos");
        estadosUnidos.setNumeroCopasGanadas(0);
        estadosUnidos.setPosFifa(14);
        estadosUnidos.setGrupo("G");
        estadosUnidos.setpUno(1);
        estadosUnidos.setpDos(3);
        estadosUnidos.setpTres(3);
        teams.add(estadosUnidos);

        Team honduras = new Team();
        honduras.setNombrePais("Honduras");
        honduras.setNumeroCopasGanadas(0);
        honduras.setPosFifa(30);
        honduras.setGrupo("E");
        honduras.setpUno(1);
        honduras.setpDos(2);
        honduras.setpTres(1);
        teams.add(honduras);

        Team costaRica = new Team();
        costaRica.setNombrePais("Costa Rica");
        costaRica.setNumeroCopasGanadas(0);
        costaRica.setPosFifa(34);
        costaRica.setGrupo("D");
        costaRica.setpUno(3);
        costaRica.setpDos(3);
        costaRica.setpTres(3);
        teams.add(costaRica);

        Team mexico = new Team();
        mexico.setNombrePais("México");
        mexico.setNumeroCopasGanadas(0);
        mexico.setPosFifa(19);
        mexico.setGrupo("A");
        mexico.setpUno(3);
        mexico.setpDos(1);
        mexico.setpTres(2);
        teams.add(mexico);

        Team japon = new Team();
        japon.setNombrePais("Japón");
        japon.setNumeroCopasGanadas(0);
        japon.setPosFifa(47);
        japon.setGrupo("C");
        japon.setpUno(1);
        japon.setpDos(2);
        japon.setpTres(2);
        teams.add(japon);

        Team australia = new Team();
        australia.setNombrePais("Australia");
        australia.setNumeroCopasGanadas(0);
        australia.setPosFifa(59);
        australia.setGrupo("B");
        australia.setpUno(3);
        australia.setpDos(3);
        australia.setpTres(3);
        teams.add(australia);

        Team coreadelSur = new Team();
        coreadelSur.setNombrePais("Corea del Sur");
        coreadelSur.setNumeroCopasGanadas(0);
        coreadelSur.setPosFifa(55);
        coreadelSur.setGrupo("H");
        coreadelSur.setpUno(2);
        coreadelSur.setpDos(2);
        coreadelSur.setpTres(1);
        teams.add(coreadelSur);

        Team iran = new Team();
        iran.setNombrePais("Irán");
        iran.setNumeroCopasGanadas(0);
        iran.setPosFifa(37);
        iran.setGrupo("F");
        iran.setpUno(2);
        iran.setpDos(2);
        iran.setpTres(1);
        teams.add(iran);

        Team brasil = new Team();
        brasil.setNombrePais("Brasil");
        brasil.setNumeroCopasGanadas(5);
        brasil.setPosFifa(4);
        brasil.setGrupo("A");
        brasil.setpUno(1);
        brasil.setpDos(2);
        brasil.setpTres(1);
        teams.add(brasil);

        Team argentina = new Team();
        argentina.setNombrePais("Argentina");
        argentina.setNumeroCopasGanadas(2);
        argentina.setPosFifa(7);
        argentina.setGrupo("F");
        argentina.setpUno(3);
        argentina.setpDos(2);
        argentina.setpTres(1);
        teams.add(argentina);

        Team colombia = new Team();
        colombia.setNombrePais("Colombia");
        colombia.setNumeroCopasGanadas(0);
        colombia.setPosFifa(5);
        colombia.setpUno(1);
        colombia.setGrupo("C");
        colombia.setpDos(1);
        colombia.setpTres(2);
        teams.add(colombia);

        Team chile = new Team();
        chile.setNombrePais("Chile");
        chile.setNumeroCopasGanadas(0);
        chile.setPosFifa(13);
        chile.setGrupo("B");
        chile.setpUno(3);
        chile.setpDos(3);
        chile.setpTres(1);
        teams.add(chile);

        Team ecuador = new Team();
        ecuador.setNombrePais("Ecuador");
        ecuador.setNumeroCopasGanadas(0);
        ecuador.setPosFifa(28);
        ecuador.setGrupo("E");
        ecuador.setpUno(1);
        ecuador.setpDos(3);
        ecuador.setpTres(1);
        teams.add(ecuador);

        Team uruguay = new Team();
        uruguay.setNombrePais("Uruguay");
        uruguay.setNumeroCopasGanadas(2);
        uruguay.setPosFifa(6);
        uruguay.setGrupo("D");
        uruguay.setpUno(1);
        uruguay.setpDos(2);
        uruguay.setpTres(3);
        teams.add(uruguay);

        Team costadeMarfil = new Team();
        costadeMarfil.setNombrePais("Costa de Marfil");
        costadeMarfil.setNumeroCopasGanadas(0);
        costadeMarfil.setPosFifa(21);
        costadeMarfil.setGrupo("C");
        costadeMarfil.setpUno(3);
        costadeMarfil.setpDos(3);
        costadeMarfil.setpTres(1);
        teams.add(costadeMarfil);

        Team camerun = new Team();
        camerun.setNombrePais("Camerún");
        camerun.setNumeroCopasGanadas(0);
        camerun.setPosFifa(50);
        camerun.setGrupo("A");
        camerun.setpUno(1);
        camerun.setpDos(1);
        camerun.setpTres(3);
        teams.add(camerun);

        Team nigeria = new Team();
        nigeria.setNombrePais("Nigeria");
        nigeria.setNumeroCopasGanadas(0);
        nigeria.setPosFifa(44);
        nigeria.setGrupo("F");
        nigeria.setpUno(1);
        nigeria.setpDos(1);
        nigeria.setpTres(2);
        teams.add(nigeria);

        Team argelia = new Team();
        argelia.setNombrePais("Argelia");
        argelia.setNumeroCopasGanadas(0);
        argelia.setPosFifa(25);
        argelia.setGrupo("H");
        argelia.setpUno(3);
        argelia.setpDos(2);
        argelia.setpTres(1);
        teams.add(argelia);

        Team ghana = new Team();
        ghana.setNombrePais("Ghana");
        ghana.setNumeroCopasGanadas(0);
        ghana.setPosFifa(38);
        ghana.setGrupo("G");
        ghana.setpUno(3);
        ghana.setpDos(2);
        ghana.setpTres(1);
        teams.add(ghana);
//<property name="hibernate.hbm2ddl.auto">create-drop</property>
        Equipo e;
        DaoEquipo daoEquipo;
        for (Team team : teams) {
            e = new Equipo();
            daoEquipo = new DaoEquipo();

            e.setNombrepais(team.getNombrePais());
            e.setNumerocopasganadas(team.getNumeroCopasGanadas());
            e.setRankingfifa(team.getPosFifa());
            e.setPartidodos(team.getpDos());
            e.setPartidouno(team.getpUno());
            e.setPartidotres(team.getpTres());
            e.setGrupo(team.getGrupo());
            
            daoEquipo.guardar(e);
        }
      
//        List<Group> group = new ArrayList();
//        Group a = new Group();
//        a.setNombreGrupo("A");
//        a.setEquipo1(brasil);
//        a.setEquipo2(croacia);
//        a.setEquipo3(mexico);
//        a.setEquipo4(camerun);
//        group.add(a);
//
//        Group b = new Group();
//        b.setNombreGrupo("B");
//        b.setEquipo1(espania);
//        b.setEquipo2(holanda);
//        b.setEquipo3(chile);
//        b.setEquipo4(australia);
//        group.add(b);
//
//        Group c = new Group();
//        c.setNombreGrupo("C");
//        c.setEquipo1(colombia);
//        c.setEquipo2(grecia);
//        c.setEquipo3(costadeMarfil);
//        c.setEquipo4(japon);
//        group.add(c);
//
//        Group d = new Group();
//        d.setNombreGrupo("D");
//        d.setEquipo1(uruguay);
//        d.setEquipo2(costaRica);
//        d.setEquipo3(inglaterra);
//        d.setEquipo4(italia);
//        group.add(d);
//
////        Group e = new Group();
////        e.setNombreGrupo("E");
////        e.setEquipo1(suiza);
////        e.setEquipo2(ecuador);
////        e.setEquipo3(francia);
////        e.setEquipo4(honduras);
////        group.add(e);
//
//        Group f = new Group();
//        f.setNombreGrupo("F");
//        f.setEquipo1(argentina);
//        f.setEquipo2(bosnia);
//        f.setEquipo3(iran);
//        f.setEquipo4(nigeria);
//        group.add(f);
//
//        Group g = new Group();
//        g.setNombreGrupo("G");
//        g.setEquipo1(alemania);
//        g.setEquipo2(portugal);
//        g.setEquipo3(ghana);
//        g.setEquipo4(estadosUnidos);
//        group.add(g);
//
//        Group h = new Group();
//        h.setNombreGrupo("H");
//        h.setEquipo1(belgica);
//        h.setEquipo2(argelia);
//        h.setEquipo3(rusia);
//        h.setEquipo4(coreadelSur);
//        group.add(h);

//        Grupo grup = new Grupo();
//        Set eq=new HashSet();
//        DaoGrupo daoGrupo = new DaoGrupo();
//        for (Group gr : group) {
//            grup.setNombregrupo(gr.getNombreGrupo());
//            eq.add(gr.getEquipo1());
//            eq.add(gr.getEquipo2());
//            eq.add(gr.getEquipo3());
//            eq.add(gr.getEquipo4());
//            grup.setEquipos(eq);
//            daoGrupo.guardar(grup);
//        }
//////////////        List<Equipo> ls = new ArrayList<Equipo>();
//////////////        DaoEquipo daoEquipo = new DaoEquipo();
//////////////        DaoEquipo daoEquipo1 = new DaoEquipo();        
//////////////        ls = daoEquipo.listaEquipo(false);
//////////////        for (Equipo equipo : ls) {
//////////////            if (equipo.getEquipo()==1) {
//////////////                equipo.setPartidotres(1);
//////////////                daoEquipo1.editar(equipo);                
//////////////            }
//////////////            System.out.println(equipo.getNombrepais());
//////////////        }
    }

}
