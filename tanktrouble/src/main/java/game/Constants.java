package game;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.Random;

public interface Constants {
    /**
     * title of window
     */
    String WINDOW_TITLE = "Tank Trouble";
    /**
     * width of window
     */
    int WIDTH = 1600;
    /**
     * height of window
     */
    int HEIGHT = 900;
    /**
     * number of AI tanks
     */
    int AI_COUNT = 12;
    /**
     * number of player tanks
     */
    int PLAYER_COUNT = 2;
    /**
     * number of bushes
     */
    int BUSH_COUNT = 35;
    /**
     * number of mud puddles
     */
    int MUD_COUNT = 6;
    /**
     * screen refresh multiplier
     */
    double REFRESH_MULTIPLIER = 1;
    /**
     * screen refresh rate (120 Hz base rate)
     */
    double REFRESH_RATE = 120 * REFRESH_MULTIPLIER;
    /**
     * movement multiplier
     */
    double MOVEMENT_MULTIPLIER = 1;
    /**
     * bullet movement (pixel per frame)
     */
    double BULLET_MOVEMENT = 1.5 * MOVEMENT_MULTIPLIER / REFRESH_MULTIPLIER;
    /**
     * tank movement (pixel per frame)
     */
    double TANK_MOVEMENT = 1 * MOVEMENT_MULTIPLIER / REFRESH_MULTIPLIER;
    /**
     * turn multiplier
     */
    double TURN_MULTIPLIER = 2;
    /**
     * bullet duration (seconds)
     */
    double BULLET_DURATION = 5 / MOVEMENT_MULTIPLIER;
    /**
     * bullet score
     */
    double BULLET_SCORE = 20;
    /**
     * movement score
     */
    double MOVEMENT_SCORE = 1;
    /**
     * fire penaly
     */
    double FIRE_PENALTY = 1;
    /**
     * reverse penalty
     */
    double REVERSE_PENALTY = 2;
    /**
     * bullet count
     */
    int BULLET_COUNT = 5;
    /**
     * reload time (seconds)
     */
    double RELOAD_TIME = .1 / MOVEMENT_MULTIPLIER;
    /**
     * slow multiplier (increase to slow down)
     */
    double SLOW_MULTIPLIER = .45;
    /**
     * input layer size
     */
    int INPUT_LAYER_SIZE = AI_COUNT * 2;
    /**
     * output layer size
     */
    int OUTPUT_LAYER_SIZE = 5;
    /**
     * elite size
     */
    int ELITE_COUNT = 15;
    /**
     * weights cache filename
     */
    String CACHE_PATH = "weights.dat";

    /**
     * random number generator
     */
    Random random = new Random();

    /**
     * cardinal direction constants
     */

    int SOUTH_EAST = 45;

    int SOUTH_WEST = 135;

    int NORTH_WEST = 225;

    int NORTH_EAST = 315;

    /**
     * rotation constants
     */

    int FULL_TURN = 360;

    int HALF_TURN = 180;

    int THREE_QUART_TURN = 270;

    int QUART_TURN = 90;

    int THREE_HALF_TURN = 540;

    /**
     * small values
     */

    int epsilon = 10;

    /**
     * store a big number for easy minimums
     */
    double INF = 99999999.0;

    /**
     * training time
     */
    long TRAINING_TIME = 1;

    /**
     * random range
     *
     * @param low  lower bound
     * @param high upper bound
     * @return random double within range
     */
    static double randomRange(int low, int high) {
        return random.nextInt(high - low) + low + random.nextDouble();
    }
}
