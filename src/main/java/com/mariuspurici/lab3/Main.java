package com.mariuspurici.lab3;

import com.mariuspurici.lab3.adapter.RoundHole;
import com.mariuspurici.lab3.adapter.RoundPeg;
import com.mariuspurici.lab3.adapter.SquarePeg;
import com.mariuspurici.lab3.adapter.SquarePegAdapter;
import com.mariuspurici.lab3.bridge.AdvancedRemoteControl;
import com.mariuspurici.lab3.bridge.Tv;
import com.mariuspurici.lab3.bridge.Radio;
import com.mariuspurici.lab3.composite.Circle;
import com.mariuspurici.lab3.composite.CompoundGraphic;
import com.mariuspurici.lab3.composite.Dot;
import com.mariuspurici.lab3.composite.Graphic;
import com.mariuspurici.lab3.facade.VideoConverter;
import com.mariuspurici.lab3.facade.VideoFile;
import com.mariuspurici.lab3.proxy.CachedYouTubeClass;
import com.mariuspurici.lab3.proxy.ThirdPartyYouTubeClass;
import scala.Console;

public class Main {
    public static void run() {
        // Test the proxy pattern
        System.out.println(Console.GREEN() + "Testing the Proxy pattern:" + Console.RESET());
        ThirdPartyYouTubeClass thirdPartyYouTubeClass = new ThirdPartyYouTubeClass();
        CachedYouTubeClass cachedYouTubeClass = new CachedYouTubeClass(thirdPartyYouTubeClass);
        System.out.println("First call of listVideos() method:");
        System.out.println(cachedYouTubeClass.listVideos());
        System.out.println("Second call of listVideos() method:");
        System.out.println(cachedYouTubeClass.listVideos());
        System.out.println("First call of downloadVideo(3)");
        System.out.println(cachedYouTubeClass.downloadVideo(3));
        System.out.println("Second call of downloadVideo(3)");
        System.out.println(cachedYouTubeClass.downloadVideo(3));

        // Test Adapter pattern
        System.out.println(Console.GREEN() + "\nTesting the Adapter pattern:" + Console.RESET());
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(9);
        System.out.println(roundPeg + " fits inside " + roundHole + ": " + roundHole.fits(roundPeg));
        SquarePeg squarePeg = new SquarePeg(9);
        System.out.println(squarePeg);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(squarePegAdapter + " fits inside " + roundHole + ": " + roundHole.fits(squarePegAdapter));

        // Test Facade pattern
        System.out.println(Console.GREEN() + "\nTesting the Facade pattern:" + Console.RESET());
        VideoFile videoFile = (new VideoConverter()).convert("CatsVideo.mp4", "ogg");

        // Test Bridge pattern
        System.out.println(Console.GREEN() + "\nTesting the Bridge pattern:" + Console.RESET());
        Tv tv = new Tv();
        System.out.println(tv);
        AdvancedRemoteControl tvRemoteControl = new AdvancedRemoteControl(tv);
        tvRemoteControl.togglePower();
        tvRemoteControl.channelDown();
        tvRemoteControl.channelDown();
        tvRemoteControl.channelDown();
        tvRemoteControl.volumeUp();
        tvRemoteControl.volumeUp();
        System.out.println(tv);
        // Do the exactly same thing on the radio class
        Radio radio = new Radio();
        System.out.println(radio);
        AdvancedRemoteControl radioRemoteControl = new AdvancedRemoteControl(radio);
        radioRemoteControl.togglePower();
        radioRemoteControl.mute();
        System.out.println(radio);

        // Test Composite pattern
        System.out.println(Console.GREEN() + "\nTesting the Composite pattern:" + Console.RESET());
        CompoundGraphic compoundGraphicChild = new CompoundGraphic();
        compoundGraphicChild.add(new Dot(0, 0));
        compoundGraphicChild.add(new Circle(33,44, 3));
        CompoundGraphic compoundGraphicParrent = new CompoundGraphic();
        compoundGraphicParrent.add(compoundGraphicChild);
        compoundGraphicParrent.add(new Circle(-33, -44, 23));
        compoundGraphicParrent.add(new Dot(-1, -1));
        System.out.println(compoundGraphicParrent);
        compoundGraphicParrent.move(1, 1);
        System.out.println(compoundGraphicParrent);
        compoundGraphicParrent.draw();
    }
}
