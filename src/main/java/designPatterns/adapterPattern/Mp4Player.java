package designPatterns.adapterPattern;

/**
 * @auther heer
 * @create 2022/4/15
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        //do nothing
    }

    @Override
    public void playMp4(String fileName){
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
