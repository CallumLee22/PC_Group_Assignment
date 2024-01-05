import greenfoot.*;
import java.util.Date;  // Import Date class for time calculations

/**
 * This is the class for the enemy that opposes the Player
 * 
 * Ben Jefferis 
 * 19/12/2023
 */
public class Enemy extends Actor {
    private static final int SPEED = 2;
    private boolean hitObstacle = false;
    private int prevX, prevY;
    private boolean damaging = false;  // Declaration for damaging
    private long now;
    private long now2;

    // Constructor
    public Enemy() {
        now = new Date().getTime();  // Initialize 'now' in the constructor
    }

    public void act() {
        followPlayer();
        handleObstacles();
        checkCollisions();
        
        if (!damaging && (now2 > now + 1000)) {
            damage();
            damaging = false;
        }
    }

    private void followPlayer() {
        // move the enemy towards the player
        // get the player object from the world
        Player player = (Player) getWorld().getObjects(Player.class).get(0);

        if (player != null) {
            int dx = player.getX() - getX();
            int dy = player.getY() - getY();
            double angle = Math.atan2(dy, dx);

            int deltaX = (int) (SPEED * Math.cos(angle));
            int deltaY = (int) (SPEED * Math.sin(angle));

            setLocation(getX() + deltaX, getY() + deltaY);
        }
    }

    private boolean hitObstacles() {
        // Check if the enemy hits an object that blocks movement
        if (isTouching(DayBridge.class) || isTouching(NightBridge.class)) {
            return false;
        } else if (isTouching(DayWater.class) || isTouching(NightWater.class)
                || isTouching(DayFence1.class) || isTouching(NightFence1.class)) {
            return true;
        } else {
            return false;
        }
    }

    private void handleObstacles() {
        if (hitObstacles()) {
            // If the enemy hits an obstacle, move back to the previous location
            setLocation(prevX, prevY);
        } else {
            // Update the previous location
            prevX = getX();
            prevY = getY();
        }
    }

    private void checkCollisions() {
        // Check for collisions with Player class
        Player player = (Player) getOneIntersectingObject(Player.class);

        if (player != null) {
            // Player is hit, decrease player's health
            player.getHit(10); // Adjust the damage value as needed
            System.out.println("Player hit! Current health: " + player.health);

            // Remove a Heart object from the world
            Heart heart = (Heart) player.getWorld().getObjects(Heart.class).get(0);
            player.getWorld().removeObject(heart);
        }
    }

    private void damage() {
        Player player = (Player) getOneIntersectingObject(Player.class);
        if (player != null) {
            damaging = true;
            player.health -= 10;
            now = new Date().getTime();
        }
    }
}
