package com.jdroid.android.sample;

import android.os.Build;

import com.jdroid.android.BuildConfig;
import com.jdroid.android.debug.http.HttpDebugConfiguration;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, manifest=Config.NONE, application = TestAndroidApplication.class, sdk = Build.VERSION_CODES.N_MR1)
public abstract class AbstractTest {

	@Before
	public final void setUp() throws Exception {
		HttpDebugConfiguration.setHttpMockEnabled(isHttpMockEnabled());
		onSetup();
	}

	protected void onSetup() {
		// Do nothing
	}

	protected abstract Boolean isHttpMockEnabled();
}
