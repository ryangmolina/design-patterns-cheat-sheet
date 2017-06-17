package com.designpatterns;

import com.designpatterns.behavioral.chainofresponsibility.Handler;
import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.DomesticEngineer;
import com.designpatterns.behavioral.command.Programmer;
import com.designpatterns.behavioral.iterator.IntSet;
import com.designpatterns.behavioral.mediator.ChatRoom;
import com.designpatterns.behavioral.mediator.User;
import com.designpatterns.behavioral.memento.Caretaker;
import com.designpatterns.behavioral.memento.Originator;
import com.designpatterns.behavioral.observer.Gates;
import com.designpatterns.behavioral.observer.Lighting;
import com.designpatterns.behavioral.observer.SensorSystem;
import com.designpatterns.behavioral.observer.Surveillance;
import com.designpatterns.behavioral.state.CeilingFanPullChain;
import com.designpatterns.behavioral.strategy.BAR;
import com.designpatterns.behavioral.strategy.FOO;
import com.designpatterns.behavioral.strategy.Strategy;
import com.designpatterns.behavioral.templatemethod.Generalization;
import com.designpatterns.behavioral.templatemethod.Realization;
import com.designpatterns.behavioral.visitor.Computer;
import com.designpatterns.behavioral.visitor.ComputerPart;
import com.designpatterns.behavioral.visitor.ComputerPartDisplayVisitor;
import com.designpatterns.creational.abstractfactory.EnemyShip;
import com.designpatterns.creational.abstractfactory.EnemyShipBuilding;
import com.designpatterns.creational.abstractfactory.UFOEnemyShipBuilding;
import com.designpatterns.creational.builder.Cake;
import com.designpatterns.creational.singleton.Singleton;
import com.designpatterns.creational.singleton.SingletonBillPugh;
import com.designpatterns.creational.singleton.SingletonEnum;
import com.designpatterns.dependency_injection.*;
import com.designpatterns.oop_principle.Creature;
import com.designpatterns.oop_principle.Giraffe;
import com.designpatterns.structural.adapter.AudioPlayer;
import com.designpatterns.structural.bridge.Circle;
import com.designpatterns.structural.bridge.RedCircle;
import com.designpatterns.structural.bridge.Shape;
import com.designpatterns.structural.decorator.BorderDecorator;
import com.designpatterns.structural.decorator.ScrollDecorator;
import com.designpatterns.structural.decorator.TextField;
import com.designpatterns.structural.decorator.Widget;
import com.designpatterns.structural.facade.ShapeMaker;
import com.designpatterns.structural.flyweight.FlyweightFactory;
import com.designpatterns.structural.proxy.Image;
import com.designpatterns.structural.proxy.ProxyImage;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Polymorphism
        Creature giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());
        giraffe.sayHello();

        //Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        SingletonBillPugh sbp1 = SingletonBillPugh.getInstance();
        SingletonBillPugh sbp2 = SingletonBillPugh.getInstance();

        SingletonEnum se1 = SingletonEnum.INSTANCE;
        SingletonEnum se2 = SingletonEnum.INSTANCE;

        print("s1", s1);
        print("s2", s2);

        print("sbp1", sbp1);
        print("sbp2", sbp2);

        print("se1", se1);
        print("se2", se2);


        //Factory
        EnemyShipBuilding shipBuilder = new UFOEnemyShipBuilding();
        EnemyShip theGrunt = shipBuilder.orderTheShip("UFO");



        //Builder
        Cake cake = new Cake.CakeBuilder()
                .sugar(12)
                .butter(13)
                .milk(14)
                .build();
        System.out.println(cake.toString());


        //Adapter
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");


        //Proxy
        Image image = new ProxyImage("test.jpg");
        image.display();


        //Facade
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();


        //Bridge
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        redCircle.draw();


        //Decorator
        Widget widget = new BorderDecorator(
                new BorderDecorator(
                        new ScrollDecorator(
                                new TextField()
                        )
                ));

        widget.draw();


        //Flyweight
        Random rn = new Random();
        Frame frame = new Frame("Flyweight Demo");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(10, 10));
        // 1. Identify shareable and non-shareable state
        //    shareable - Button label, non-shareable - Button location
        for (int i=0; i < 10; i++)
            for (int j=0; j < 10; j++)
                // 3. The client must use the Factory to request objects
                frame.add(FlyweightFactory.makeButton(
                        Integer.toString(rn.nextInt(15))));
        frame.pack();
        frame.setVisible( true );
        FlyweightFactory.report();


        //Chain of Responsibility
        Handler rootChain = new Handler();
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.wrapAround(rootChain);
        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);
            System.out.println();
        }


        //Command
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Programmer());
        for (Object command : queue) {
            ((Command)command).execute();
        }


        //Interpreter
/*        System.out.println("celsius * 9 / 5 + thirty");
        String postfix = Interpreter.convertToPostfix("celsius * 9 / 5 + thirty");
        System.out.println(postfix);
        Operand expr = Interpreter.buildSyntaxTree(postfix);
        expr.traverse(1);
        System.out.println();
        HashMap< String, Integer > map = new HashMap<>();
        map.put("thirty", 30);
        for (int i = 0; i <= 100; i += 10) {
            map.put("celsius", i);
            System.out.println("C is " + i + ",  F is " + expr.evaluate(map));
        }*/


        //Iterator
        IntSet set = new IntSet();
        for (int i=2; i < 10; i += 2) {
            set.add(i);
        }
        for (int i=1; i < 9; i++) {
            System.out.print(i + "-" + set.isMember(i) + "  ");
        }
        // 3. Clients ask the collection object to create many iterator objects
        IntSet.Iterator it1 = set.createIterator();
        IntSet.Iterator it2 = set.createIterator();
        // 4. Clients use the first(), isDone(), next(), currentItem() protocol
        System.out.print( "\nIterator:    " );
        for ( it1.first(), it2.first();  ! it1.isDone();  it1.next(), it2.next() ) {
            System.out.print(it1.currentItem() + " " + it2.currentItem() + "  ");
        }
        // Java uses a different collection traversal "idiom" called Enumeration
        System.out.print( "\nEnumeration: " );
        for (Enumeration e = set.getHashtable().keys(); e.hasMoreElements(); )
            System.out.print( e.nextElement() + "  " );
        System.out.println();


        //Mediator
        ChatRoom chatRoom = new ChatRoom();
        User robert = new User(chatRoom);
        User john = new User(chatRoom);
        robert.setName("Robert");
        john.setName("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");


        //Memento
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
		originator.restore( caretaker.getMemento(0) );
        originator.restore( caretaker.getMemento(1) );


        //Observer
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();


        //State
        CeilingFanPullChain chain = new CeilingFanPullChain();
        int level = 0;
        while (level++ < 10) {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }


        //Strategy
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }


        //Template Method
        Generalization algorithm = new Realization();
        algorithm.findSolution();


        //Visitor
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());


		Heater heater = new ElectricHeater();
		Pump pump = new Thermosiphon(heater);
        CoffeeMaker coffeeMaker = new CoffeeMaker(heater, pump);

    }
    // client code here
    private static void execute(Strategy strategy) {
        strategy.solve();
    }



    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }


    static void print(String literal, Object obj) {
        System.out.println(String.format("Object: %s, Hashcode: %d", literal, obj.hashCode()));
    }
}
