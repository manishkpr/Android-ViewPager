package com.manishkpr.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;



public class ViewPagerStyle1Activity extends FragmentActivity {
	private ViewPager _mViewPager;
	private ViewPagerAdapter _adapter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setUpView();
        setTab();
    }
    private void setUpView(){    	
   	 _mViewPager = (ViewPager) findViewById(R.id.viewPager);
     _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
     _mViewPager.setAdapter(_adapter);
	 _mViewPager.setCurrentItem(0);
    }
    private void setTab(){
			_mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
			    		
						@Override
						public void onPageScrollStateChanged(int position) {}
						@Override
						public void onPageScrolled(int arg0, float arg1, int arg2) {}
						@Override
						public void onPageSelected(int position) {
							// TODO Auto-generated method stub
							switch(position){
							case 0:
								findViewById(R.id.first_tab).setVisibility(View.VISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
								break;
								
							case 1:
								findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.VISIBLE);
								break;
							}
						}
						
					});

    }
}