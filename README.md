# XCardView
### 支持CardView阴影颜色自定义

效果图:

- 红色阴影
![](./imags/CardView_1.png)
- 绿色阴影
![](./imags/CardView_2.png)
- 蓝色阴影
![](./imags/CardView_3.png)
- 默认阴影
![](./imags/CardView_4.png)


### 使用

```
<?xml version="1.0" encoding="utf-8"?>
<com.gaohui.xcardview.widgets.XCardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    app:cardCornerRadius="4dp"
    app:cardElevation="2dp"
    app:cardShadowColor="#ff0000"
    app:cardPreventCornerOverlap="false"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <ImageView
        android:id="@+id/image_beauty"
        android:src="@mipmap/ic_launcher"
        android:layout_width="match_parent"
        android:layout_height="160dp" />

</com.gaohui.xcardview.widgets.XCardView>

```


```
 <declare-styleable name="XCardView">
        <attr format="color" name="cardBackgroundColor"/>
        <attr format="color" name="cardShadowColor"/>
        <attr format="dimension" name="cardCornerRadius"/>
        <attr format="dimension" name="cardElevation"/>
        <attr format="dimension" name="cardMaxElevation"/>
        <attr format="boolean" name="cardUseCompatPadding"/>
        <attr format="boolean" name="cardPreventCornerOverlap"/>
        <attr format="dimension" name="contentPadding"/>
        <attr format="dimension" name="contentPaddingLeft"/>
        <attr format="dimension" name="contentPaddingRight"/>
        <attr format="dimension" name="contentPaddingTop"/>
        <attr format="dimension" name="contentPaddingBottom"/>
        <attr name="android:minWidth"/>
        <attr name="android:minHeight"/>
    </declare-styleable>

```

基本用法与原生CardView类似，cardCornerRadius指定圆角弧度，cardElevation指定阴影的高度，因为原生CardView默认不支持阴影颜色的自定义，故添加cardShadowColor来指定阴影颜色。

基于原生CardView的修改，具体文章分析后续补上。

关于
--

博客：[https://blog.csdn.net/H_Gao](https://blog.csdn.net/H_Gao)

邮箱：532294580@qq.com

License
--
Copyright 2018 JasonGaoH

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions