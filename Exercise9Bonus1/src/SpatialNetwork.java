import java.util.ArrayList;
import java.util.Random;

/**
 * Class containing the logic of the network
 * Created by Sam on 26/11/2015.
 */
public class SpatialNetwork {

    private int numberTrees;
    private double threshold, initial, infect;
    private ArrayList<Tree> trees;

    /**
     * Create new network with the given number of trees and given threshold
     *
     * @param numberTrees number of nodes in the network
     * @param threshold    threshold under which trees are said to be connected
     */
    public SpatialNetwork(int numberTrees, double threshold, double initial, double infect) {
        this.numberTrees = numberTrees;
        this.threshold = threshold;
        this.initial = initial;
        this.infect = infect;
        trees = new ArrayList<>();
        initTrees();
    }

    /**
     * Initialise the node positions
     */
    public void initTrees() {
        Random rand = new Random();
        trees.clear();
        for (int i = 0; i < 200; i++) {
            trees.add(new Tree(rand.nextDouble(), rand.nextDouble(), rand.nextDouble() < initial));
        }
    }

    /**
     * Check if two trees are closer together than the threshold and thus connected
     *
     * @param ox origin x coord
     * @param oy origin y coord
     * @param dx destination x coord
     * @param dy destination y coord
     * @return true if connected false if not
     */
    public boolean areConnected(double ox, double oy, double dx, double dy) {
        return Math.sqrt(Math.pow(dx - ox, 2) + Math.pow(dy - oy, 2)) < threshold;
    }

    public void simulateDay() {
        Random rand = new Random();
        System.out.println(trees.size());
        for (Tree tree : trees) {
            double x = tree.getX();
            double y = tree.getY();

            for (Tree destTree : trees) {
                double dx = destTree.getX();
                double dy = destTree.getY();

                // if trees are connected and one is and one isn't then infect other
                if (areConnected(x, y, dx, dy) && !tree.isInfected() && destTree.isInfected() && rand.nextDouble() < infect) {
                    tree.setInfected(true);
                }
            }
        }
    }

    /**
     * Return number of nodes
     *
     * @return number of nodes
     */
    public int getNumberTrees() {
        return numberTrees;
    }

    /**
     * Return current threshold
     *
     * @return threshold
     */
    public double getThreshold() {
        return threshold;
    }

    /**
     * Return list of nodes
     *
     * @return list of nodes
     */
    public ArrayList<Tree> getTrees() {
        return trees;
    }

    /**
     * Set the number of nodes
     *
     * @param numberTrees new number of nodes
     */
    public void setNumberTrees(int numberTrees) {
        this.numberTrees = numberTrees;
    }

    /**
     * Set the threshold
     *
     * @param threshold new threshold
     */
    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

}
