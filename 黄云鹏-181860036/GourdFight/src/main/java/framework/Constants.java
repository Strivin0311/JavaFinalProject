package framework;

/**
 * 
 * @author 王浩天
 * @version	2020.12.22
 * @inherit 
 * @functions 为游戏框架提供一些重要的全局静态常量，如长宽、坐标、名称等，方便随时调用
 * @properties 
 * @methods  	
 */

public class Constants { // 常量类，提供游戏中所有需要的常量

	// 窗口
	public static final String WINDOW_TITLE = "GourdBaby VS Monsters"; // 游戏标题 
	public static final int WINDOW_WIDTH = 900; // 窗口宽度
	public static final int WINDOW_HEIGHT = 500; // 窗口高度
	
	// 页面
	public static final String HOME_VIEW_KEY = "Home View"; // 主页面
	public static final double HOME_VIEW_BUTTON_W = 150; // 主页面按钮宽度
	
	public static final String MODE_VIEW_KEY = "Mode View"; // 模式选择页面
	public static final String NET_VIEW_KEY = "Net View"; // 网络端选择页面
	public static final String ROLE1_VIEW_KEY = "Role1 View"; // 玩家1角色选择页面
	public static final String ROLE2_VIEW_KEY = "Role2 View"; // 玩家2角色选择页面
	public static final String PLAY_VIEW_KEY = "Play View"; // 游戏页面
	
	public static final String GAMEOVER_VIEW_KEY = "Gameover View"; // 游戏结束页面
	public static final double GAMEOVER_IMAGEVIEW_W = 300; // 游戏结束页面图片显示器宽度
	public static final double GAMEOVER_IMAGEVIEW_H = 500; // 游戏结束页面图片显示器宽度
	public static final double GAMEOVER_BUTTON_W = 100; // 游戏结束页面按钮宽度
	
	
	
	public static final String STACK_PANE = "Stack Pane"; //栈控件
	public static final String IMAGE_PANE = "Image Pane"; // 图片控件
	
	// 资源文件夹
	public static final String MAIN_DIRECTORY = "main"; // 主资源
	public static final String TEST_DIRECTORY = "test"; // 测试资源
	public static final String BACKGROUND_DIRECTORY = "background"; // 页面背景图片资源
	
	// 背景音频
	public static final String BGM = "BGM"; // 背景音频文件夹名
	public static final String HOME_VIEW_BGM = "Home View BGM"; // 主页面背景音频名
	public static final String MODE_VIEW_BGM = "Home View BGM"; // 模式选择页面背景音频名
	public static final String NET_VIEW_BGM = "Home View BGM"; // 网络端选择页面背景音频名
	public static final String ROLE_VIEW_BGM = "Home View BGM"; // 角色选择页面背景音频名
	public static final String PLAY_VIEW_BGM = "Play View BGM"; // 游戏页面背景音频文件名
	public static final String GAMEOVER_VIEW_BGM = "GameOver View BGM"; // 游戏结束页面背景音频文件名
	
	
	// 网络
	public static final int PORT = 8001; // 端口号
	
	// 实体身份/名称(注：后缀1的为自己，后缀2的为对手)
	public static final String BACKGROUND = "background"; // 背景
	public static final String STATEBAR = "statebar"; // 状态栏
	public static final String PLAYER1 = "player1"; // 玩家1
	public static final String PLAYER2 = "player2"; // 玩家2
	public static final String BLOODBAR1 = "bloodBar1"; // 血槽1
	public static final String BLOODBAR2 = "bloodBar2"; // 血槽2
	public static final String BLOODBAR_NAME = "bloodBar"; // 血槽名称 
	public static final String BLOOD1 = "blood1"; // 血条1
	public static final String BLOOD2 = "blood2"; // 血条2
	public static final String BLOOD_NAME = "blood"; // 血条名称 
	public static final String ENERGYBAR1 = "energyBar1"; // 能量槽1
	public static final String ENERGYBAR2 = "energyBar2"; // 能量槽2
	public static final String ENERGYBAR_NAME = "energyBar"; // 能量槽名称 
	public static final String ENERGY1 = "energy1"; // 能量条1
	public static final String ENERGY2 = "energy2"; // 能量条2
	public static final String ENERGY_NAME = "energy"; // 血条名称 
	public static final String PK = "pk"; // PK图标
	public static final String COUNTDOWN = "countDown"; // 倒计时
	public static final String TEXT = " Text"; // 招式文本
	public static final String PROFILE1 = "profile1"; //头像1
	public static final String PROFILE2 = "profile2"; //头像2
	public static final String STATE1 = "state1"; // 状态1
	public static final String STATE2 = "state2"; // 状态2
	
	public static final String REDBABY_NAME = "redBaby"; // 大娃实体名称
	public static final String REDBABY_ATTACKNEAR_NAME = "Normal Punch"; // 大娃近攻招式名称
	public static final String REDBABY_ATTACKFAR_NAME = "Fire Punch"; // 大娃远攻招式名称
	public static final String REDBABY_ATTACKKILL_NAME = "Gold Punch"; // 大娃必杀招式名称
	public static final String REDBABY_DEFEND_NAME = "Defend Stone"; // 大娃防御招式名称
	
	public static final String ORANGEBABY_NAME = "orangeBaby"; // 二娃实体名称
	public static final String ORANGEBABY_ATTACKNEAR_NAME = "Normal Sand"; // 二娃近攻招式名称
	public static final String ORANGEBABY_ATTACKFAR_NAME = "Sand Sword"; // 二娃远攻招式名称
	public static final String ORANGEBABY_ATTACKKILL_NAME = "Sand Storm"; // 二娃必杀招式名称
	public static final String ORANGEBABY_DEFEND_NAME = "Defend Gourd"; // 二娃防御招式名称
	
	public static final String YELLOWBABY_NAME = "yellowBaby"; // 三娃实体名称
	public static final String YELLOWBABY_ATTACKNEAR_NAME = "Normal Hammer"; // 三娃近攻招式名称
	public static final String YELLOWBABY_ATTACKFAR_NAME = "Long Gun"; // 三娃远攻招式名称
	public static final String YELLOWBABY_ATTACKKILL_NAME = "Demon Sword"; // 三娃必杀招式名称
	public static final String YELLOWBABY_DEFEND_NAME = "American Shield"; // 三娃防御招式名称
	
	public static final String GREENBABY_NAME = "greenBaby"; // 四娃实体名称
	public static final String GREENBABY_ATTACKNEAR_NAME = "Normal FireBall"; // 四娃近攻招式名称
	public static final String GREENBABY_ATTACKFAR_NAME = "Long FireBall"; // 四娃远攻招式名称
	public static final String GREENBABY_ATTACKKILL_NAME = "Black FireBall"; // 四娃必杀招式名称
	public static final String GREENBABY_DEFEND_NAME = "Fire Wheel"; // 四娃防御招式名称
	
	public static final String BLUEBABY_NAME = "blueBaby"; // 五娃实体名称
	public static final String BLUEBABY_ATTACKNEAR_NAME = "Fish Knife"; // 五娃近攻招式名称
	public static final String BLUEBABY_ATTACKFAR_NAME = "Water Bullet"; // 五娃远攻招式名称
	public static final String BLUEBABY_ATTACKKILL_NAME = "Water Dragon"; // 五娃必杀招式名称
	public static final String BLUEBABY_DEFEND_NAME = "Water Wall"; // 五娃防御招式名称
	
	public static final String INDIGOBABY_NAME = "indigoBaby"; // 六娃实体名称
	public static final String INDIGOBABY_ATTACKNEAR_NAME = "Empty Punch"; // 六娃近攻招式名称
	public static final String INDIGOBABY_ATTACKFAR_NAME = "Empty Bang"; // 六娃远攻招式名称
	public static final String INDIGOBABY_ATTACKKILL_NAME = "Empty Range"; // 六娃必杀招式名称
	public static final String INDIGOBABY_DEFEND_NAME = "Empty Shield"; // 六娃防御招式名称
	
	public static final String PURPLEBABY_NAME = "purpleBaby"; // 七娃实体名称
	public static final String PURPLEBABY_ATTACKNEAR_NAME = "Normal Punch"; // 七娃近攻招式名称
	public static final String PURPLEBABY_ATTACKFAR_NAME = "Fire Punch"; // 七娃远攻招式名称
	public static final String PURPLEBABY_ATTACKKILL_NAME = "Gold Punch"; // 七娃必杀招式名称
	public static final String PURPLEBABY_DEFEND_NAME = "Defend Stone"; // 七娃防御招式名称
	
	public static final String GRANDFATHER_NAME = "grandfather"; // 爷爷实体名称
	public static final String GRANDFATHER_ATTACKNEAR_NAME = "Normal Punch"; // 爷爷近攻招式名称
	public static final String GRANDFATHER_ATTACKFAR_NAME = "Fire Punch"; // 爷爷远攻招式名称
	public static final String GRANDFATHER_ATTACKKILL_NAME = "Gold Punch"; // 爷爷必杀招式名称
	public static final String GRANDFATHER_DEFEND_NAME = "Defend Stone"; // 爷爷防御招式名称
	
	public static final String SNAKE_NAME = "snake"; // 蛇精实体名称
	public static final String SNAKE_ATTACKNEAR_NAME = "Grass Sword"; // 蛇精近攻招式名称
	public static final String SNAKE_ATTACKFAR_NAME = "Snake Hand"; // 蛇精远攻招式名称
	public static final String SNAKE_ATTACKKILL_NAME = "Ghost Kill"; // 蛇精必杀招式名称
	public static final String SNAKE_DEFEND_NAME = "Sand Relive"; // 蛇精防御招式名称
	
	public static final String SCORPION_NAME = "scorpion"; // 蝎子精实体名称
	public static final String SCORPION_ATTACKNEAR_NAME = "Rotate Ball"; // 蝎子精近攻招式名称
	public static final String SCORPION_ATTACKFAR_NAME = "Rotate Sword"; // 蝎子精远攻招式名称
	public static final String SCORPION_ATTACKKILL_NAME = "Black Ball"; // 蝎子精必杀招式名称
	public static final String SCORPION_DEFEND_NAME = "Bud Wall"; // 蝎子精防御招式名称
	
	public static final String CHILOPOD_NAME = "chilopod"; // 蜈蚣精实体名称
	public static final String CHILOPOD_ATTACKNEAR_NAME = "Chilopod Tooth"; // 蜈蚣精近攻招式名称
	public static final String CHILOPOD_ATTACKFAR_NAME = "Poisoned Punch"; // 蜈蚣精远攻招式名称
	public static final String CHILOPOD_ATTACKKILL_NAME = "Chilopod Body"; // 蜈蚣精必杀招式名称
	public static final String CHILOPOD_DEFEND_NAME = "Bond Shield"; // 蜈蚣精防御招式名称
	
	public static final String CROCODILE_NAME = "crocodile"; // 鳄鱼精实体名称
	public static final String CROCODILE_ATTACKNEAR_NAME = "Water Shark"; // 鳄鱼精近攻招式名称
	public static final String CROCODILE_ATTACKFAR_NAME = "Water Wind"; // 鳄鱼精远攻招式名称
	public static final String CROCODILE_ATTACKKILL_NAME = "Shark Bullet"; // 鳄鱼精必杀招式名称
	public static final String CROCODILE_DEFEND_NAME = "Defend Shell"; // 鳄鱼精防御招式名称
	
	
	// 实体位置(注：后缀1的为自己，后缀2的为对手)
	public static final double BACKGROUND_X = 0; // 背景x轴坐标
	public static final double BACKGROUND_Y = 0; // 背景y轴坐标
	
	public static final double BLOODBAR1_X = 20; // 血槽1x轴坐标
	public static final double BLOODBAR1_Y = 90; // 血槽1y轴坐标
	public static final double BLOODBAR2_X = 570; // 血槽2x轴坐标
	public static final double BLOODBAR2_Y = 90; // 血槽2y轴坐标
	
	public static final double BLOOD1_X = 82; // 血条1x轴坐标
	public static final double BLOOD1_Y = 120; // 血条1y轴坐标
	public static final double BLOOD2_X = 627; // 血条2x轴坐标
	public static final double BLOOD2_Y = 120; // 血条2y轴坐标
	
	public static final double ENERGYBAR_DELTAY = -22; // 能量槽相对于玩家头顶的y轴位移
	public static final double ENERGY_DELTAY = -20; // 能量条相对于玩家头顶的y轴位移
	
	public static final double PK_X = 410; // PK图标x轴坐标
	public static final double PK_Y = 90; // PK图标y轴坐标
	
	public static final double COUNTDOWN_X = 380; // 倒计时图标x轴坐标
	public static final double COUNTDOWN_Y = 290; // 倒计时图标y轴坐标
	
	public static final double ROUND_X = 350; // round图标x轴坐标
	public static final double ROUND_Y = 290; // round 图标y轴坐标
	
	public static final double TEXT_DELTAY = -80; // 招式文本相对于玩家头顶的y轴位移
	
	public static final double PLAYER1_INIT_X = 50; // 玩家1初始x轴坐标
	public static final double PLAYER1_INIT_Y = 300; // 玩家1初始y轴坐标
	public static final double PLAYER2_INIT_X = 700; // 玩家2初始x轴坐标
	public static final double PLAYER2_INIT_Y = 300; // 玩家2初始y轴坐标
	
	// 实体大小
	public static final double BACKGROUND_W = WINDOW_WIDTH; // 背景宽度
	public static final double BACKGROUND_H = WINDOW_HEIGHT; // 背景宽度
	
	public static final double BLOODBAR_W = 300; // 血槽宽度
	public static final double BLOODBAR_H = 72; // 血槽宽度
	
	public static final double BLOOD_W = 180; // 血条最大宽度
	public static final double BLOOD_H = 10; // 血条高度
	
	public static final double ENERGYBAR_W = 90; // 能量槽宽度
	public static final double ENERGYBAR_H = 10; // 能量槽宽度
	
	public static final double ENERGY_W = 88; // 能量条最大宽度
	public static final double ENERGY_H = 6; // 能量条高度
	
	public static final double PK_W = 80; // PK图标宽度
	public static final double PK_H = 80; // PK图标宽度
	
	public static final double COUNTDOWN_W = 120; // 倒计时图标宽度
	public static final double COUNTDOWN_H = 120; // 倒计时图标宽度
	
	public static final double ROUND_W = 550; // round图标宽度
	public static final double ROUND_H = 200; // round图标高度
	
	public static final double TEXT_W = 120; // 招式文本宽度
	public static final double TEXT_H = 30; // 招式文本高度
	
	public static final double PLAYER_DEFAULT_W = 100; // 玩家默认宽度
	public static final double PLAYER_DEFAULT_H = 150; // 玩家默认高度
	
	public static final double PLAYER_DEFAULT_ATTACK_W = 70; // 玩家默认攻击实体宽度
	public static final double PLAYER_DEFAULT_ATTACK_H = 70; // 玩家默认攻击实体高度
	
	public static final double PLAYER_DEFAULT_DEFEND_W = 70; // 玩家默认防御实体宽度
	public static final double PLAYER_DEFAULT_DEFEND_H = 70; // 玩家默认防御实体高度
	
	// 实体状态值
	public static final String STANDING_FORWARD = "standingForward"; // 朝正面站着
	public static final String STANDING_TOLEFT = "standingToLeft"; // 朝左边站着
	public static final String STANDING_TORIGHT = "standingToRight"; // 朝右边站着
	public static final String MOVING_TOLEFT = "movingToLeft"; // 朝左边移动
	public static final String MOVING_TORIGHT = "movingToRight"; // 朝右边移动
	public static final String RUNNING_TOLEFT = "runningToLeft"; // 朝左边冲刺
	public static final String RUNNING_TORIGHT = "runningToRight"; // 朝右边冲刺
	public static final String JUMPING_TOLEFT = "jumpingToLeft"; // 朝左边跳跃
	public static final String JUMPING_TORIGHT = "jumpingToRight"; // 朝右边跳跃
	public static final String LYING_TOLEFT = "lyingToLeft"; //朝左边倒地
	public static final String LYING_TORIGHT = "lyingToRight"; // 朝右边倒地
	public static final String ATTACKING_NEAR_TOLEFT = "attackingNearToLeft"; // 朝左边近攻
	public static final String ATTACKING_NEAR_TORIGHT = "attackingNearToRight"; // 朝右边近攻
	public static final String ATTACKING_FAR_TOLEFT = "attackingFarToLeft"; // 朝左边远攻
	public static final String ATTACKING_FAR_TORIGHT = "attackingFarToRight"; // 朝右边远攻
	public static final String ATTACKING_KILL_TOLEFT = "attackingKillToLeft"; // 朝左边必杀
	public static final String ATTACKING_KILL_TORIGHT = "attackingKillToRight"; // 朝右边必杀
	public static final String DEFENDING_TOLEFT = "defendingToLeft"; // 朝左边防御
	public static final String DEFENDING_TORIGHT = "defendingToRight"; // 朝右边防御
	
	// 辅助状态值
	public static final String ATTACKING_TOLEFT = "attackingToLeft"; // 朝左边进攻
	public static final String ATTACKING_TORIGHT = "attackingToRight"; // 朝右边进攻
	public static final String WINNER = "winner"; // 游戏胜利
	public static final String LOSER = "loser"; // 游戏失败
	
	// 实体其他属性
	public static final double DEFAULT_LIFE_VALUE = 100; // 默认生命值
	public static final double DEFAULT_MOVE_SPEED = 5; // 默认移动速度
	public static final double DEFAULT_RUN_SPEED = 12; // 默认冲刺速度
	public static final double DEFAULT_JUMP_SPEED = 5; // 默认跳跃速度
	public static final double DEFAULT_JUMP_HEIGHT = 200; // 默认跳跃高度
	
	public static final double DEFAULT_ATTACK_NEAR_VALUE = 10; // 默认近攻攻击值
	public static final double DEFAULT_ATTACK_NEAR_DIST = 50; // 默认近攻距离
	public static final double DEFAULT_ATTACK_NEAR_SPEED = 4; // 默认近攻实体移动速度
	
	public static final double DEFAULT_ATTACK_FAR_VALUE = 15; // 默认远攻攻击值
	public static final double DEFAULT_ATTACK_FAR_DIST = 250; // 默认远攻距离
	public static final double DEFAULT_ATTACK_FAR_SPEED = 8; // 默认远攻实体移动速度
	
	public static final double DEFAULT_ATTACK_KILL_VALUE = 25; // 默认必杀攻击值
	public static final double DEFAULT_ATTACK_KILL_DIST = 150; // 默认必杀距离
	public static final double DEFAULT_ATTACK_KILL_SPEED = 6; // 默认必杀实体移动速度
	public static final double ENERGY_THRESHOLD_SCALE = 30; // 满能量阈值和必杀攻击值的比例
	public static final double ENERGY_HURT_SCALE = 5; // 能量增值和伤害值的比例
	
	public static final double DEFAULT_DEFEND_VALUE = 5; // 默认防御值
	public static final double DEFAULT_DEFEND_DIST = 20; // 默认防御距离
	public static final double DEFAULT_DEFEND_SPEED = 3; // 默认防御实体移动速度
	
}
