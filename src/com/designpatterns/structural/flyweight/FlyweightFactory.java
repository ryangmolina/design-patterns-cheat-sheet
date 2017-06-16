package com.designpatterns.structural.flyweight;

import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * Identify shareable state (intrinsic) and non-shareable state (extrinsic)
 * Create a Factory that can return an existing object or a new object
 * The client must use the Factory instead of "new" to request objects
 * The client (or a third party) must provide/compute the extrinsic state
 */
public class FlyweightFactory {

    private static Map treeMap = new TreeMap();
    private static int sharedButtons = 0;
    private static ButtonListener listener = new ButtonListener();

    public static Button makeButton(String num) {

        Button button;
        if (treeMap.containsKey(num)) {
            // 1. Identify intrinsic state (Button label)
            // 2. Return an existing object   [The same Button cannot be added
            //    multiple times to a container, and, Buttons cannot be cloned.
            //    So - this is only simulating the sharing that the Flyweight
            //    pattern provides.]
            button = new Button(((Button) treeMap.get(num)).getLabel());
            sharedButtons++;
        } else {
            // 2. Return a new object
            button = new Button(num);
            treeMap.put(num, button);
        }
        button.addActionListener(listener);
        return button;
    }

    public static void report() {
        System.out.print("new Buttons - " + treeMap.size()
                + ", \"shared\" Buttons - " + sharedButtons + ", ");
        for (Object o : treeMap.keySet()) {
            System.out.print(o + " ");
        }
        System.out.println();
    }


}
