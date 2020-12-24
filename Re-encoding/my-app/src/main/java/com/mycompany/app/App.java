package com.mycompany.app;


import java.io.*;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.ffmpeg.avutil.*;
import org.bytedeco.ffmpeg.avcodec.*;


 
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException 
    {
        String ffmpeg = Loader.load(org.bytedeco.ffmpeg.ffmpeg.class);
     ProcessBuilder pb = new ProcessBuilder(ffmpeg, "-i", "/home/busra/İndirilenler/sample_640x360.flv","-vcodec","libx264","-acodec","copy","/home/busra/İndirilenler/sample_640x360.mp4");
    pb.inheritIO().start().waitFor();
 
    }
   
}

