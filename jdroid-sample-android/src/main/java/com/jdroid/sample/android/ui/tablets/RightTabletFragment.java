package com.jdroid.sample.android.ui.tablets;

import android.view.MenuItem;

import com.jdroid.android.fragment.AbstractFragment;
import com.jdroid.android.utils.ScreenUtils;
import com.jdroid.android.utils.ToastUtils;
import com.jdroid.sample.android.R;

public class RightTabletFragment extends AbstractFragment {
	
	@Override
	public Integer getContentFragmentLayout() {
		return R.layout.right_tablet_fragment;
	}

	@Override
	public Integer getMenuResourceId() {
		return R.menu.right_tablet_menu;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.rightAdd:
				ToastUtils.showInfoToast(R.string.rightAction);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public Boolean isSecondaryFragment() {
		return ScreenUtils.is10Inches();
	}
}
