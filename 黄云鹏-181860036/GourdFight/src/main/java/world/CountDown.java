package world;

import framework.Constants;
import javafx.scene.image.Image;
import output.URL;

/**
 * 
 * @author 黄云鹏
 * @version	2020.12.27
 * @inherit Entity
 * @functions 倒计时的实体类
 * @properties count、round
 * @methods
 */

public class CountDown extends Entity { // 倒计时实体类

	private int count; // 倒计时(单位:秒)
	private int round; // 游戏当前局数
	
	// 初始化
	public CountDown(String name) {
		super(name);
		// 子类特殊设置
//		setMobile(false);
//		setActive(true);
//		setAttackable(false);
//		setDefendable(false);
//		
		setWidth(Constants.COUNTDOWN_W);
		setHeight(Constants.COUNTDOWN_H);
//		
//		setLifeValue(Constants.DEFAULT_LIFE_VALUE);
//		setMoveSpeed(Constants.DEFAULT_MOVE_SPEED);
//		setRunSpeed(Constants.DEFAULT_RUN_SPEED);
//		setJumpSpeed(Constants.DEFAULT_JUMP_SPEED);
//		setJumpHeight(Constants.DEFAULT_JUMP_HEIGHT);
//		
//		setAttackNearValue(Constants.DEFAULT_ATTACK_NEAR_VALUE);
//		setAttackNearDist(Constants.DEFAULT_ATTACK_NEAR_DIST);
//		setAttackNearSpeed(Constants.DEFAULT_ATTACK_NEAR_SPEED);
//		setAttackNearWidth(Constants.PLAYER_DEFAULT_ATTACK_W);
//		setAttackNearHeight(Constants.PLAYER_DEFAULT_ATTACK_H);
//		
//		setAttackFarValue(Constants.DEFAULT_ATTACK_FAR_VALUE);
//		setAttackFarDist(Constants.DEFAULT_ATTACK_FAR_DIST);
//		setAttackFarSpeed(Constants.DEFAULT_ATTACK_FAR_SPEED);
//		setAttackFarWidth(Constants.PLAYER_DEFAULT_ATTACK_W);
//		setAttackFarHeight(Constants.PLAYER_DEFAULT_ATTACK_H);
//		
//		setAttackKillValue(Constants.DEFAULT_ATTACK_KILL_VALUE);
//		setAttackKillDist(Constants.DEFAULT_ATTACK_KILL_DIST);
//		setAttackKillSpeed(Constants.DEFAULT_ATTACK_KILL_SPEED);
//		setAttackKillWidth(Constants.PLAYER_DEFAULT_ATTACK_W);
//		setAttackKillHeight(Constants.PLAYER_DEFAULT_ATTACK_H);
//		
//		setDefendValue(Constants.DEFAULT_DEFEND_VALUE);
//		setDefendDist(Constants.DEFAULT_DEFEND_DIST);
//		setDefendSpeed(Constants.DEFAULT_DEFEND_SPEED);
//		setDefendWidth(Constants.PLAYER_DEFAULT_DEFEND_W);
//		setDefendHeight(Constants.PLAYER_DEFAULT_DEFEND_H);	
		
		// 设置三秒倒计时图片
		count = 180;
		String[] countStr = new String[]{"count1","count2","count3"}; 
		String dirStr = "main";
		String filePath = URL.toPngPath(dirStr, name,countStr[0]); 
		Image img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.STANDING_FORWARD,img); // 1
		filePath = URL.toPngPath(dirStr, name, countStr[1]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.STANDING_TOLEFT, img); // 2
		filePath = URL.toPngPath(dirStr, name, countStr[2]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.STANDING_TORIGHT, img); // 3
		
		// 设置round图片
		String[] roundStr = new String[] {"round1","round2","round3","round4","round5"};
		filePath = URL.toPngPath(dirStr, name, roundStr[0]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.MOVING_TOLEFT, img); // round 1
		filePath = URL.toPngPath(dirStr, name, roundStr[1]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.MOVING_TORIGHT, img); // round 2
		filePath = URL.toPngPath(dirStr, name, roundStr[2]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.RUNNING_TOLEFT, img); // round 3
		filePath = URL.toPngPath(dirStr, name, roundStr[3]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.RUNNING_TORIGHT, img); // round 4
		filePath = URL.toPngPath(dirStr, name, roundStr[4]); 
		img = new Image(URL.toURL(filePath)); 
		addImage(EntityState.JUMPING_TOLEFT, img); // round 5
	}

	// Getter
	@Override
	public Image getCurrentImage() {
		if(count <= 180 && count > 120) { // 3
			count--;
			return getImage(EntityState.STANDING_TORIGHT);
		}
		else if(count <= 120 && count > 60) { // 2
			count--;
			return getImage(EntityState.STANDING_TOLEFT);
		}
		else if(count <= 60 && count > 0) { // 1
			count--;
			return getImage(EntityState.STANDING_FORWARD);
		}
		else if(count <= 0 && count > -60) { // round
			count--;
			switch (round) {
			case 1:
				return getImage(EntityState.MOVING_TOLEFT);
			case 2:
				return getImage(EntityState.MOVING_TORIGHT);
			case 3:
				return getImage(EntityState.RUNNING_TOLEFT);
			case 4:
				return getImage(EntityState.RUNNING_TORIGHT);
			case 5:
				return getImage(EntityState.JUMPING_TOLEFT);
			default:
				return getImage(EntityState.MOVING_TOLEFT);
			}
		}
		else {
			count = 0;
			return null;
		}
	}

	public boolean isRound() { // 是否进入round显示阶段
		return count <= 0;
	}
	
	// Setter
	public void setRound(int round) { // 设置当前游戏局数
		this.round = round;
	}
	
}
