package com.cutv.mobile.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * ���������
 * 
 * @author linweidong
 * @Date 2010-09-15
 */
public class DashedLine extends View {
	private final String namespace = "http://com.smartmap.driverbook";
	private float startX;
	private float startY;
	private float endX;
	private float endY;
	private Rect mRect;

	public DashedLine(Context context, AttributeSet attrs) {
		super(context, attrs);

	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);

		Rect r = new Rect();
		this.getDrawingRect(r);

		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setColor(Color.DKGRAY);
		paint.setStrokeWidth(1);
		Path path = new Path();
		path.moveTo(0, r.height() / 2);
		path.lineTo(r.width(), r.height() / 2);

		// float�е�Ԫ�ظ��� >= 2
		// {10,5} ��10����ʵ��, ��5���ȿհף� Ȼ��ѭ��
		PathEffect effects = new DashPathEffect(new float[] { 10, 5 }, 1);
		paint.setPathEffect(effects);
		canvas.drawPath(path, paint);
	}
}