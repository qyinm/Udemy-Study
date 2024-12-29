package com.hippoo.studyspring;

import com.hippoo.studyspring.game.GameRunner;
import com.hippoo.studyspring.game.GamingConsole;
import com.hippoo.studyspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
