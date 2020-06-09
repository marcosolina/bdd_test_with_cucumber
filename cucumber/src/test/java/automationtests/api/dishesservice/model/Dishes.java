package automationtests.api.dishesservice.model;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is a wrapper class which provides a list of Dishes. The list does
 * <b>not</b> allow duplicates
 * 
 * @author msolina
 *
 */
public class Dishes {
    private Set<Dish> dishList;

    /**
     * Add the dish to the existing list
     * 
     * @param dish
     * @return
     */
    public boolean addDish(Dish dish) {
        if (dishList == null) {
            dishList = new HashSet<>();
        }

        return dishList.add(dish);
    }

    public Set<Dish> getDishes() {
        return dishList;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishList = dishes;
    }

}
