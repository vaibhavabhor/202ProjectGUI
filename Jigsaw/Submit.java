// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// 
// /**
//  * Write a description of class Submit here.
//  * 
//  * @author (your name) 
//  * @version (a version number or a date)
//  */
// public class Submit extends CommandButton
// {
//     public Submit()
//     {
//         GreenfootImage image = getImage();
// 
//     }
// 
//     public void act() 
//     {
// 
//         if(Greenfoot.mousePressed(this))
//         {
//             for(int i = 0 ; i < StartButton.matrix.size(); i++)
//             {
//                 String nameGrid = (String)StartButton.matrix.get(i);
//                 String nameSplit  = (String)Canvas.splitImagesList.get(i);
// 
//                 if(nameGrid.equals(nameSplit))
//                 {
//                     System.out.println("Matching");
//                 }
//                 else
//                 {
//                     System.out.println("Not Matching");
//                 }
//             }
//         }
//     }    
// }
