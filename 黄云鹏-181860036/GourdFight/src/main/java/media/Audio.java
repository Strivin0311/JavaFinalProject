package media;

import java.io.File;
import java.util.HashMap;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import output.URL;

/**
 * 
 * @author 王浩天
 * @version	2020.12.26
 * @inherit 
 * @functions 为游戏提供播放效果音频或者背景音频的功能
 * @properties clipMap、bgmMap
 * @methods  	
 * 		playClip / stopClip(String d, String f): （停止）播放效果音频
 * 		playBGM / stopBGM(String d, String f): （停止）播放背景音频
 */

public class Audio { // 音频播放类，用于播放游戏背景音频，以及游戏人物效果音频

	HashMap<String, AudioClip> clipMap; // 效果音频字典
	HashMap<String, Media> bgmMap; // 背景音频字典
	MediaPlayer bgmPlayer; // 背景音播放器
	
	private boolean cutting; // 是否切歌
	
	// 初始化
	public Audio() {
		clipMap = new HashMap<>();
		bgmMap = new HashMap<>();
		cutting = true;
	}

	// Setter
	public void setCutting(boolean c) {
		cutting = c;
	}
	
	// 播放功能
	public void playClip(String d, String f) { // 播放效果音频
		
		String dirStr = "main";
		String filePath = URL.toMP3Path(dirStr, d, f);
		File file = new File(filePath);
		if(!file.exists()) { // 文件不存在则直接返回，以免播放异常
			return;
		}
		String source = URL.toURL(filePath);
		
		AudioClip audioClip = clipMap.get(source);
		if(audioClip == null) { // 该音频文件未曾被播放过
			audioClip = new AudioClip(source);
			audioClip.play();
			clipMap.put(source, audioClip);
		}
		else { 
			if(audioClip.isPlaying()) { // 该音频文件正在播放
				if(cutting)
					audioClip.play(); 
				else
					return;
				
			}else { // 该音频文件曾被播放过
				audioClip.play();
			}
		}
	}
	
	public void stopClip(String d, String f) { // 停止播放效果音频
		String dirStr = "main";
		String filePath = URL.toMP3Path(dirStr, d, f);
		File file = new File(filePath);
		if(!file.exists()) { // 文件不存在则直接返回，以免播放异常
			return;
		}
		String source = URL.toURL(filePath);
		
		AudioClip audioClip = clipMap.get(source);
		if(audioClip != null && audioClip.isPlaying()) {
			audioClip.stop();
		}
	}
	
	public void playBGM(String d, String f) { // 播放背景音频
		String dirStr = "main";
		String filePath = URL.toMP3Path(dirStr, d, f);
		File file = new File(filePath);
		if(!file.exists()) { // 文件不存在则直接返回，以免播放异常
			return;
		}
		String source = URL.toURL(filePath);
		
		Media media = bgmMap.get(source);
		if(media == null) { // 该音频文件未曾被播放过
			media = new Media(source);
			bgmMap.put(source, media);
		}
		if(bgmPlayer != null) { // 停止上一个背景音频
			bgmPlayer.stop();
		}
		// 播放新背景音频
		bgmPlayer = new MediaPlayer(media);
		bgmPlayer.setCycleCount(MediaPlayer.INDEFINITE); // 无限循环
		bgmPlayer.play();
	}
	
	public void stopBGM() { // 停止播放背景音频
		if(bgmPlayer != null) { 
			bgmPlayer.stop();
		}
	}
	
}
