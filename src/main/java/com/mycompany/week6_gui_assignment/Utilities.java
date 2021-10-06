package com.mycompany.week6_gui_assignment;

import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

//created this class to take away some of the messy initializing 
public class Utilities {
        //create instance of App class to access the shape creation methods
        App ap = new App();
        
        //shape creation from App class methods on lines 15-83(see App methods for specifics)
        Rectangle r1 = ap.ground(); 
        Rectangle r2 = ap.sky(); 
        Rectangle r3 = ap.houseWall(); 
        Rectangle r4 = ap.underRoof(); 
        Polygon p1 = ap.roof();
        Rectangle r5 = ap.column1();
        Rectangle r6 = ap.column2();
        Rectangle r7 = ap.column3();
        Rectangle r8 = ap.column4();
        Rectangle r9 = ap.columnBase1();
        Rectangle r10 = ap.columnBase2();
        Rectangle r11 = ap.columnBase3();
        Rectangle r12 = ap.columnBase4();
        Circle c1 = ap.column1TopL();
        Circle c2 = ap.column1TopR();
        Circle c3 = ap.column2TopL();
        Circle c4 = ap.column2TopR();
        Circle c5 = ap.column3TopL();
        Circle c6 = ap.column3TopR();
        Circle c7 = ap.column4TopL();
        Circle c8 = ap.column4TopR();
        Rectangle r13 = ap.columnUnderBaseL();
        Rectangle r14 = ap.columnUnderBaseR();
        Rectangle r15 = ap.step1();
        Rectangle r16 = ap.step2();
        Rectangle r17 = ap.step3();
        Rectangle r18 = ap.step4();
        Rectangle r19 = ap.step5();
        Rectangle r20 = ap.step6();
        Rectangle r21 = ap.step7();
        Rectangle r22 = ap.step8();
        Rectangle r23 = ap.step9();
        Rectangle r24 = ap.step10();
        Rectangle r25 = ap.step11();
        Rectangle r26 = ap.door1();
        Rectangle r27 = ap.door2();
        Rectangle r28 = ap.door3();
        Rectangle r29 = ap.topWindow();
        Rectangle r30 = ap.window1R1C1();
        Rectangle r31 = ap.window1R1C2();
        Rectangle r32 = ap.window1R2C1();
        Rectangle r33 = ap.window1R2C2();
        Rectangle r34 = ap.window1R3C1();
        Rectangle r35 = ap.window1R3C2();
        Rectangle r36 = ap.window1R4C1();
        Rectangle r37 = ap.window1R4C2();
        Rectangle r38 = ap.window1R5C1();
        Rectangle r39 = ap.window1R5C2();
        Rectangle r40 = ap.window3R1C1();
        Rectangle r41 = ap.window3R1C2();
        Rectangle r42 = ap.window3R2C1();
        Rectangle r43 = ap.window3R2C2();
        Rectangle r44 = ap.window3R3C1();
        Rectangle r45 = ap.window3R3C2();
        Rectangle r46 = ap.window3R4C1();
        Rectangle r47 = ap.window3R4C2();
        Rectangle r48 = ap.window3R5C1();
        Rectangle r49 = ap.window3R5C2();
        Rectangle r50 = ap.window2R1C1();
        Rectangle r51 = ap.window2R1C2();
        Rectangle r52 = ap.window2R2C1();
        Rectangle r53 = ap.window2R2C2();
        Rectangle r54 = ap.window2R3C1();
        Rectangle r55 = ap.window2R3C2();
        Rectangle r56 = ap.window2R4C1();
        Rectangle r57 = ap.window2R4C2();
        Rectangle r58 = ap.window2R5C1();
        Rectangle r59 = ap.window2R5C2();
        
        //Grouping shape objects to be more organized
        Group mainGP = new Group(r1,r2,r3,r4,p1);
        Group columnGroup = new Group(r5,r6,r7,r8,r9,r10,r11,r12);
        Group columnDetailGroup = new Group(c1,c2,c3,c4,c5,c6,c7,c8,r13,r14);
        Group stepGroup = new Group(r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25);
        Group doorGroup = new Group(r26,r27,r28,r29);
        Group windowGroupDoor1 = new Group(r30,r31,r32,r33,r34,r35,r36,r37,r38,r39);
        Group windowGroupDoor2 = new Group(r50,r51,r52,r53,r54,r55,r56,r57,r58,r59);
        Group windowGroupDoor3 = new Group(r40,r41,r42,r43,r44,r45,r46,r47,r48,r49);
        
    //Groups all objects to the main group in the correct order
    public void create(){
        mainGP.getChildren().add(columnGroup);
        mainGP.getChildren().add(columnDetailGroup);
        mainGP.getChildren().add(stepGroup);
        mainGP.getChildren().add(doorGroup);
        mainGP.getChildren().add(windowGroupDoor1);
        mainGP.getChildren().add(windowGroupDoor2);
        mainGP.getChildren().add(windowGroupDoor3);
        }
        
        //array of windows to make changing their color easier
        Rectangle[] windowArr = {r30,r31,r32,r33,r34,r35,r36,r37,r38,r39,r40,r41,r42,r43,r44,r45,r46,r47,r48,r49,r50,r51,r52,r53,r54,r55,r56,r57,r58,r59};
               
}
        



