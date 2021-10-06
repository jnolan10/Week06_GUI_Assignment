package com.mycompany.week6_gui_assignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import com.mycompany.week6_gui_assignment.Utilities;
import javafx.scene.input.MouseButton;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //create instance of the utility class to make App code cleaner
        Utilities util = new Utilities();
        
        //Method from utilities class that groups all the objects together 
        util.create();
        
        //Mouse action event for changing the windows yellow, and opening the door clicked 3 times(leftmost door)
        util.r26.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
            if(mouseEvent.getClickCount() == 3){
                for(int i = 0; i < util.windowArr.length;i++ )
                    util.windowArr[i].setFill(Color.YELLOW);
                
                Rectangle OpenDoor1 = new Rectangle(160, 210, 65, 105);
                OpenDoor1.setFill(Color.YELLOW);
                OpenDoor1.setStroke(Color.BLACK);
                util.mainGP.getChildren().add(OpenDoor1);
                
                    }
                }
            }
        });
        
        //Mouse action event for changing the windows yellow, and opening the door clicked 3 times(rightmost door)
        util.r28.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
            if(mouseEvent.getClickCount() == 3){
                for(int i = 0; i < util.windowArr.length;i++ )
                    util.windowArr[i].setFill(Color.YELLOW);
                
                Rectangle OpenDoor2 = new Rectangle(415, 210, 65, 105);
                OpenDoor2.setFill(Color.YELLOW);
                OpenDoor2.setStroke(Color.BLACK);
                util.mainGP.getChildren().add(OpenDoor2);
                    }
                }
            }
        });
        
        //Mouse action event for changing the windows yellow, and opening the door clicked 3 times(middle door)
        util.r27.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
            if(mouseEvent.getClickCount() == 3){
                for(int i = 0; i < util.windowArr.length;i++ )
                    util.windowArr[i].setFill(Color.YELLOW);
                
                Rectangle OpenDoor3 = new Rectangle(285, 190, 70, 125);
                OpenDoor3.setFill(Color.YELLOW);
                OpenDoor3.setStroke(Color.BLACK);
                util.mainGP.getChildren().add(OpenDoor3);
                    }
                }
            }
        });
        
        //using the group created from utility class
        var scene = new Scene(util.mainGP, 640, 500);
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();
    }
    
    //Shape creation method for the ground in the background
    public Rectangle ground(){
        Rectangle rec1 = new Rectangle(0,220, 640, 280);
        rec1.setFill(Color.SPRINGGREEN);
        return rec1;
    }
    
    //Shape creation method for the sky in the background
    public Rectangle sky(){
        Rectangle rec2 = new Rectangle(0,0, 640, 220);
        rec2.setFill(Color.SKYBLUE); 
        return rec2;
    }
    
    //Shape creation method for the brown backdrop wall of the house
    public Rectangle houseWall(){
        Rectangle houseWall = new Rectangle(100,90,440,320);
        houseWall.setStroke(Color.BLACK);
        houseWall.setFill(Color.CHOCOLATE);
        return houseWall;
    } 
    
    //Shape creation method for the roof of the house
    public Polygon roof(){    
        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{
        320.0, 0.0,
        60.0, 100.0,
        580.0, 100.0 });
        roof.setStroke(Color.BLACK);
        roof.setFill(Color.WHITE);
        return roof;
    }
    
    //shape creation method for large white rectangle under the roof that spans the length of the house
    public Rectangle underRoof(){
        Rectangle underRoof = new Rectangle(100,100,440,25);
        underRoof.setFill(Color.WHITE);
        underRoof.setStroke(Color.BLACK);
        return underRoof;
    }
    //Shape creation methods for columns of the house, number indicates the column from left to right
    public Rectangle column1(){
        Rectangle column1 = new Rectangle(115,125,35,180);
        column1.setStroke(Color.BLACK);
        column1.setFill(Color.WHITE);
        return column1;
    }
    
    public Rectangle column2(){
        Rectangle column2 = new Rectangle(235,125,35,180);
        column2.setStroke(Color.BLACK);
        column2.setFill(Color.WHITE);
        return column2;
    }
    
    public Rectangle column3(){
        Rectangle column3 = new Rectangle(370,125,35,180);
        column3.setStroke(Color.BLACK);
        column3.setFill(Color.WHITE);
        return column3;
    }
    
    public Rectangle column4(){
        Rectangle column4 = new Rectangle(490,125,35,180);
        column4.setStroke(Color.BLACK);
        column4.setFill(Color.WHITE);
        return column4;
    }
    
    //Shape creation methods for the large rectangles underneath the columns, number represents left to right column
    public Rectangle columnBase1(){
        Rectangle columnBase1 = new Rectangle(110,305,45,10);
        columnBase1.setStroke(Color.BLACK);
        columnBase1.setFill(Color.WHITE);
        return columnBase1;
    }
    
    public Rectangle columnBase2(){
        Rectangle columnBase2 = new Rectangle(230,305,45,10);
        columnBase2.setStroke(Color.BLACK);
        columnBase2.setFill(Color.WHITE);
        return columnBase2;
    }
    
    public Rectangle columnBase3(){
        Rectangle columnBase3 = new Rectangle(365,305,45,10);
        columnBase3.setStroke(Color.BLACK);
        columnBase3.setFill(Color.WHITE);
        return columnBase3;
    }
    
    public Rectangle columnBase4(){
        Rectangle columnBase4 = new Rectangle(485,305,45,10);
        columnBase4.setStroke(Color.BLACK);
        columnBase4.setFill(Color.WHITE);
        return columnBase4;
    }
    
    //shape creation method for the small grey piece under the column beside the top step to the left
    public Rectangle columnUnderBaseL(){
        Rectangle columnUnderBaseL = new Rectangle(100,315,55,5);
        columnUnderBaseL.setStroke(Color.BLACK);
        columnUnderBaseL.setFill(Color.LIGHTGRAY);
        return columnUnderBaseL;
    }
    
    //shape creation method for the small grey piece under the column beside the top step to the right
    public Rectangle columnUnderBaseR(){
        Rectangle columnUnderBaseR = new Rectangle(485,315,55,5);
        columnUnderBaseR.setStroke(Color.BLACK);
        columnUnderBaseR.setFill(Color.LIGHTGRAY);
        return columnUnderBaseR;
    }
    
    //the following methods are shape creation methods for the Circles at the top of the columns
        //the number represents the column from left to right, the L or R signifies what side the circle is on
    public Circle column1TopL(){
        Circle column1TopL = new Circle(115,135,10);
        column1TopL.setStroke(Color.BLACK);
        column1TopL.setFill(Color.WHITE);
        return column1TopL;
    }
    
    public Circle column1TopR(){
        Circle column1TopR = new Circle(150,135,10);
        column1TopR.setStroke(Color.BLACK);
        column1TopR.setFill(Color.WHITE);
        return column1TopR;
    }
    
    public Circle column2TopL(){
        Circle column1TopL = new Circle(235,135,10);
        column1TopL.setStroke(Color.BLACK);
        column1TopL.setFill(Color.WHITE);
        return column1TopL;
    }
    
    public Circle column2TopR(){
        Circle column1TopR = new Circle(270,135,10);
        column1TopR.setStroke(Color.BLACK);
        column1TopR.setFill(Color.WHITE);
        return column1TopR;
    }
    
    public Circle column3TopL(){
        Circle column1TopL = new Circle(370,135,10);
        column1TopL.setStroke(Color.BLACK);
        column1TopL.setFill(Color.WHITE);
        return column1TopL;
    }
    
    public Circle column3TopR(){
        Circle column1TopR = new Circle(405,135,10);
        column1TopR.setStroke(Color.BLACK);
        column1TopR.setFill(Color.WHITE);
        return column1TopR;
    }
    
    public Circle column4TopL(){
        Circle column1TopL = new Circle(490,135,10);
        column1TopL.setStroke(Color.BLACK);
        column1TopL.setFill(Color.WHITE);
        return column1TopL;
    }
    
    
    public Circle column4TopR(){
        Circle column1TopR = new Circle(525,135,10);
        column1TopR.setStroke(Color.BLACK);
        column1TopR.setFill(Color.WHITE);
        return column1TopR;
    }
    
    //step methods 1-11 are shape creation methods for the 11 steps starting from the top
    public Rectangle step1(){
        Rectangle step1 = new Rectangle(155,315,330,10);
        step1.setStroke(Color.BLACK);
        step1.setFill(Color.LIGHTGRAY);
        return step1;
    }
    
    public Rectangle step2(){
        Rectangle step2 = new Rectangle(145,325,350,10);
        step2.setStroke(Color.BLACK);
        step2.setFill(Color.LIGHTGRAY);
        return step2;
    }
    
    public Rectangle step3(){
        Rectangle step3 = new Rectangle(135,335,370,10);
        step3.setStroke(Color.BLACK);
        step3.setFill(Color.LIGHTGRAY);
        return step3;
    }
    
    public Rectangle step4(){
        Rectangle step4 = new Rectangle(125,345,390,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step5(){
        Rectangle step4 = new Rectangle(115,355,410,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step6(){
        Rectangle step4 = new Rectangle(105,365,430,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step7(){
        Rectangle step4 = new Rectangle(95,375,450,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step8(){
        Rectangle step4 = new Rectangle(85,385,470,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step9(){
        Rectangle step4 = new Rectangle(75,395,490,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step10(){
        Rectangle step4 = new Rectangle(65,405,510,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    public Rectangle step11(){
        Rectangle step4 = new Rectangle(55,415,530,10);
        step4.setStroke(Color.BLACK);
        step4.setFill(Color.LIGHTGRAY);
        return step4;
    }
    
    //shape creation method for the leftmost door
    public Rectangle door1(){
       Rectangle door1 = new Rectangle(160, 210, 65, 105);
       door1.setFill(Color.WHITE);
       door1.setStroke(Color.BLACK);
       return door1;
    }
    
    //shape creation method for the middle door
    public Rectangle door2(){
       Rectangle door1 = new Rectangle(285, 190, 70, 125);
       door1.setFill(Color.WHITE);
       door1.setStroke(Color.BLACK);
       return door1;
    }
    
    //shape creation method for the rightmost door
    public Rectangle door3(){
       Rectangle door1 = new Rectangle(415, 210, 65, 105);
       door1.setFill(Color.WHITE);
       door1.setStroke(Color.BLACK);
       return door1;
    }
    
    //Shape creation method for the grey window above the second door
    public Rectangle topWindow(){
        Rectangle topWindow = new Rectangle(285, 140, 70, 35);
        topWindow.setStroke(Color.BLACK);
        topWindow.setFill(Color.LIGHTGRAY);
        return topWindow;
    }
    
    //Shape creation method for the window in position Row 1 Column 1 on Door 1
    public Rectangle window1R1C1(){
        Rectangle wR1C1 = new Rectangle(170,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 1 on Door 1
    public Rectangle window1R2C1(){
        Rectangle wR1C1 = new Rectangle(170,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 1 on Door 1
    public Rectangle window1R3C1(){
        Rectangle wR1C1 = new Rectangle(170,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 1 on Door 1
    public Rectangle window1R4C1(){
        Rectangle wR1C1 = new Rectangle(170,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 1 on Door 1
    public Rectangle window1R5C1(){
        Rectangle wR1C1 = new Rectangle(170,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 1 Column 2 on Door 1
    public Rectangle window1R1C2(){
        Rectangle wR1C1 = new Rectangle(200,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 2 on Door 1
    public Rectangle window1R2C2(){
        Rectangle wR1C1 = new Rectangle(200,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 2 on Door 1
    public Rectangle window1R3C2(){
        Rectangle wR1C1 = new Rectangle(200,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 2 on Door 1
    public Rectangle window1R4C2(){
        Rectangle wR1C1 = new Rectangle(200,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 2 on Door 1
    public Rectangle window1R5C2(){
        Rectangle wR1C1 = new Rectangle(200,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 1 Column 1 on Door 3
    public Rectangle window3R1C1(){
        Rectangle wR1C1 = new Rectangle(425,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 1 on Door 3
    public Rectangle window3R2C1(){
        Rectangle wR1C1 = new Rectangle(425,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 1 on Door 3
    public Rectangle window3R3C1(){
        Rectangle wR1C1 = new Rectangle(425,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 1 on Door 3
    public Rectangle window3R4C1(){
        Rectangle wR1C1 = new Rectangle(425,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 1 on Door 3
    public Rectangle window3R5C1(){
        Rectangle wR1C1 = new Rectangle(425,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 1 Column 2 on Door 3
    public Rectangle window3R1C2(){
        Rectangle wR1C1 = new Rectangle(455,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 2 on Door 3
    public Rectangle window3R2C2(){
        Rectangle wR1C1 = new Rectangle(455,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 2 on Door 3
    public Rectangle window3R3C2(){
        Rectangle wR1C1 = new Rectangle(455,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 2 on Door 3
    public Rectangle window3R4C2(){
        Rectangle wR1C1 = new Rectangle(455,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 2 on Door 3
    public Rectangle window3R5C2(){
        Rectangle wR1C1 = new Rectangle(455,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 1 Column 1 on Door 2
    public Rectangle window2R1C1(){
        Rectangle wR1C1 = new Rectangle(295,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 1 on Door 2
    public Rectangle window2R2C1(){
        Rectangle wR1C1 = new Rectangle(295,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 1 on Door 2
    public Rectangle window2R3C1(){
        Rectangle wR1C1 = new Rectangle(295,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 1 on Door 2
    public Rectangle window2R4C1(){
        Rectangle wR1C1 = new Rectangle(295,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 1 on Door 2
    public Rectangle window2R5C1(){
        Rectangle wR1C1 = new Rectangle(295,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 1 Column 2 on Door 2
    public Rectangle window2R1C2(){
        Rectangle wR1C1 = new Rectangle(330,215,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 2 Column 2 on Door 2
    public Rectangle window2R2C2(){
        Rectangle wR1C1 = new Rectangle(330,235,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 3 Column 2 on Door 2
    public Rectangle window2R3C2(){
        Rectangle wR1C1 = new Rectangle(330,255,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 4 Column 2 on Door 2
    public Rectangle window2R4C2(){
        Rectangle wR1C1 = new Rectangle(330,275,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    }
    
    //Shape creation method for the window in position Row 5 Column 2 on Door 2
    public Rectangle window2R5C2(){
        Rectangle wR1C1 = new Rectangle(330,295,15,15);
        wR1C1.setStroke(Color.BLACK);
        wR1C1.setFill(Color.BLACK);
        return wR1C1;
    } 
    
    public static void main(String[] args) {
        launch();
    }
    
}