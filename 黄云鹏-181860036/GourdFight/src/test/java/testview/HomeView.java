package testview;

import app.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import framework.*;
import input.Key;
import input.KeyInput;
import input.Mouse;

public class HomeView extends View { // 主页面测试类

	private Button playBtn; // 开启游戏按钮
	private Button exitBtn; // 退出游戏按钮
	
	public HomeView() {
		super(Constants.STACK_PANE);
	}
	
	@Override
	public void onLaunch() {
		// 页面启动管理测试
		playBtn = new Button("Play"); 
		playBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// 切换到游戏页面
				Framework.app.gotoView("Play");
			}
		});
		
		exitBtn = new Button("Exit");
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// 退出游戏
				Framework.app.exit();
			}
			
		});
		
		VBox box = new VBox(playBtn,exitBtn); // 纵向布局
		box.setAlignment(Pos.CENTER); // 对齐设置
		box.setSpacing(20); // 设置间距
		
		getChildren().add(box);
	}
	
	@Override
	public void onFinish() {
		// 页面关闭管理测试
		System.out.println("onFinish Test");
		super.onFinish();
	}
	
	@Override
	public void onEnter() {
		// 进入页面管理测试
		System.out.println("onEnter Test");
		super.onEnter();
	}
	
	@Override
	public void onLeave() {
		// 退出页面管理测试
		System.out.println("onLeave Test");
		super.onLeave();
	}
	
	@Override
	public void onStart() {
		// 游戏引擎启动页面管理测试
		System.out.println("onStart Test");
		super.onStart();
	}
	
	@Override
	public void onUpdate(double time) {
		// ===============游戏引擎更新页面帧管理测试=============== 
		
//		System.out.println("onUpdate Test with time: "+time); // 测试Timer刷新线程
		
		// ===============键盘输入模块测试=============== 
		
		if(Framework.keyInput.isPressed(Key.A)) { // 测试键盘输入模块按键按下事件响应
			System.out.println("A is pressed");
		}
		
		if(Framework.keyInput.isReleased(Key.A)){ // 测试键盘输入模块按键释放事件响应
			System.out.println("A is released");
		}
		
		if(Framework.keyInput.isHeld(Key.B)) { // 测试键盘输入模块按键按住保持事件响应
			System.out.println("B is held");
		}
		
		if(Framework.keyInput.isTyped(Key.C)) { // 测试键盘输入模块按键按击事件响应
			System.out.println("C is typed by " + 
					Framework.keyInput.getTypeCount(Key.C) + 
					" times");
		}
	
		// ===============鼠标输入模块测试=============== 
		
//		System.out.println("Point: " + 
//				Framework.mouseInput.getPointX() + 
//				" " + 
//				Framework.mouseInput.getPointY()); // 测试鼠标输入模块鼠标移动事件响应
		
		if(Framework.mouseInput.isPressed(Mouse.LEFT)) { // 测试鼠标输入模块按键按下事件响应
			System.out.println("Left mouse is pressed");
		}
		
		if(Framework.mouseInput.isReleased(Mouse.LEFT)) { // 测试鼠标输入模块按键释放事件响应
			System.out.println("Left mouse is released");
		}
		
		if(Framework.mouseInput.isHeld(Mouse.RIGHT)) { // 测试鼠标输入模块按键按住保持事件响应
			System.out.println("Right mouse is held");
		}
		
		if(Framework.mouseInput.isDragged(Mouse.LEFT)) { // 测试鼠标输入模块按键拖拽事件响应
			System.out.println("Left mouse is dragged by x: " + 
					Framework.mouseInput.getDragX(Mouse.LEFT) + 
					" y: " + 
					Framework.mouseInput.getDragY(Mouse.LEFT));
		}
		
		if(Framework.mouseInput.isClicked(Mouse.MIDDLE)) { // 测试鼠标输入模块按键点击事件响应
			System.out.println("Middle mouse is clicked by " + 
					Framework.mouseInput.getClickCount(Mouse.MIDDLE) + 
					" times");
		}
		
		if(Framework.mouseInput.isScrolled()) { // 测试鼠标输入模块鼠标滚轮滚动事件响应
			System.out.println("mouse is scrolled by " + 
					Framework.mouseInput.getScrollValue());
		}
		
		super.onUpdate(time);
	}
	
	@Override
	public void onStop() {
		// 游戏引擎关闭页面管理测试
		System.out.println("onStop Test");
		super.onStop();
	}

}
