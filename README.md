android屏幕适配
===

引入库
```
implementation 'com.lbx:screenadapter:1.0.0'
```

在Activity的setContentView之前调用
```
 //设置屏幕的宽度为200dp，xml中对应的一个view若宽度为200dp，则填充满了横向
 ScreenAdapt.adaptScreen(this, 200, false);
```

`第一个参数是activity`
`第二个参数设置成多少，屏幕的宽就会是多少，单位是dp，实际使用时美工给的UI效果图宽度是多少，这里就写多少`
`第三个参数是是否为纵向基准，若传true，则第二个参数屏幕宽度效果变为屏幕高度效果，也就是说，设置屏幕高度为200，若xml中一个view的高度
为100，那么填充了纵向的一半`


值得注意的是，需要使用下面的代码代替系统原有的toast
```
ScreenAdapt.toast(this,"123");
```

 - 取消适配
 ```
 ScreenAdapt.cancelAdaptScreen(activity);
 ```
 - 判断当前是否是竖屏
 ```
 ScreenAdapt.isPortrait(activity);
 ```