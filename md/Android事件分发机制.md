# Android 事件分发机制

事件类型（4种）:
* MotionEvent.ACTION_DOWN - 按下View（所有事件的开始）
* MotionEvent.ACTION_UP - 抬起View（与DOWN对应）
* MotionEvent.ACTION_MOVE - 滑动View
* MotionEvent.ACTION_CANCEL - 结束事件（非人为原因）

 事件在哪些对象之间进行传递 :
 * Activity
 * ViewGroup
 * View
 
 ###### 事件分发的顺序
 Activity -> ViewGroup -> View
 
 ###### 事件分发过程的方法
 * dispatchTouchEvent()
    * 作用-分发点击事件
    * 当点击事件能够传递给当前View时,该方法就会被调用
 * onTouchEvent
    * 作用-处理点击事件
    * 在dispatchTouchEvent()内部调用
 * onInterceptTouchEvent() 
     * 只存在ViewGroup中
     * 在ViewGroup的dispatchTouchEvent()内部调用