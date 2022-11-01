package com.example.inkc;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.*;

public class Profile0FragmentActivity extends Fragment {

	AppConfig appConfig;

	private TextView name,address,contact,inckregis,membership;

	private LinearLayout main_ui;
	private ScrollView vscroll1;
	private LinearLayout linear10;
	private TextView textview2;
	private LinearLayout linear8;
	private CircleImageView circleimageview1;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout linear9;
	private Button button1;
	private Button button2;
	private TextView textview8;
	
	private Intent edit = new Intent();
	private Intent home = new Intent();
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.profile0_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		appConfig = new AppConfig(getContext());

		main_ui = _view.findViewById(R.id.main_ui);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear10 = _view.findViewById(R.id.linear10);
		textview2 = _view.findViewById(R.id.textview2);
		linear8 = _view.findViewById(R.id.linear8);
		circleimageview1 = _view.findViewById(R.id.circleimageview1);
		textview3 = _view.findViewById(R.id.textview3);
		textview4 = _view.findViewById(R.id.textview4);
		textview5 = _view.findViewById(R.id.textview5);
		textview6 = _view.findViewById(R.id.textview6);
		textview7 = _view.findViewById(R.id.textview7);
		linear9 = _view.findViewById(R.id.linear9);
		button1 = _view.findViewById(R.id.button1);
		button2 = _view.findViewById(R.id.button2);
		textview8 = _view.findViewById(R.id.textview8);

		name = _view.findViewById(R.id.name);
		address = _view.findViewById(R.id.address);
		contact = _view.findViewById(R.id.contact);
		inckregis = _view.findViewById(R.id.inkcregis);
		membership = _view.findViewById(R.id.membership);


		if(appConfig.getImagesession().equals("null")){

		}else {
			Glide.with(this).load("https://mployis.com/inkc/" + appConfig.getImagesession()).into(circleimageview1);
		}
		name.setText(appConfig.getNamesession());
		if(appConfig.getAddresssesion().equals("null"))
			address.setText(" ");
		else
			address.setText(appConfig.getAddresssesion());
		contact.setText(appConfig.getContactsession());
		inckregis.setText(appConfig.getInkcRegis());
		if(appConfig.getMemberShip().equals("null"))
			membership.setText("Not Member ");
		else
			membership.setText(appConfig.getMemberShip());

		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				edit.setClass(getContext().getApplicationContext(), Profile1Activity.class);
				startActivity(edit);
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		{
			GradientDrawable SketchUi = new GradientDrawable();
			int d = (int) getContext().getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF2196f3);SketchUi.setCornerRadii(new float[]{
				d*0,d*0,d*0 ,d*0,d*0,d*0 ,d*103,d*103});
			main_ui.setElevation(d*3);
			RippleDrawable SketchUiRD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFFFFFF}), SketchUi, null);
			main_ui.setBackground(SketchUiRD);
			main_ui.setClickable(true);
		}
		_radius(button1, 50, 12, "#2196f3");
		_radius(button2, 50, 12, "#2196f3");
	}
	
	public void _radius(final View _view, final double _radius, final double _shadow, final String _color) {
		GradientDrawable ab = new GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
}
