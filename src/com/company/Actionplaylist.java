package com.company;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;

/**
 * acciones del playlist
 */
    public class Actionplaylist {
        /**
         * atributo tipo basic player
         */
        private BasicPlayer player;
        /**
         *constructor
         */
        player = new BasicPlayer();
        /**
         * metodos de play, pause, stop, resume
         */
        public void Play() throws Exception {
            player.play();
        }

        public void openfile(String rute) throws Exception {
            player.open(new File(rute));
        }

        public void Pause() throws Exception {
            player.pause();
        }

        public void Continue() throws Exception {
            player.resume();
        }

        public void Stop() throws Exception {
            player.stop();
        }

    }












