package neuralnet;

import game.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * perceptron
 *
 * @author adam
 */
public abstract class Layer implements Constants {
    /**
     * network
     */
    public static List<Layer> network;
    /**
     * number of neurons in perceptron
     */
    protected int neurons;
    /**
     * state of neurons in perceptron
     */
    protected List<Double> state;
    /**
     * previous perceptron and next perceptron
     */
    protected Layer previous, next;

    /**
     * value constructor
     *
     * @param neurons number of neurons in this perceptron
     */
    public Layer(int neurons, ArrayList<Double> state) {
        this.neurons = neurons;
        this.state = state;
    }

    /**
     * calculate next state based on this state
     */
    public abstract void propagateForward();

    /**
     * add to network
     */
    public void add() {
        network.add(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this instanceof OutputLayer) {
            stringBuilder.append(neurons).append("\n");
        } else {
            stringBuilder.append(next.neurons).append(" ").append(neurons).append("\n");
        }
        return stringBuilder.toString();
    }
}
