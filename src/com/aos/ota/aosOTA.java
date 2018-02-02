package com.aos.ota;

import java.util.Set;

import android.app.Application;
import android.support.v4.util.ArrayMap;
import android.util.Log;

public class aosOTA extends Application {
	private static ArrayMap<Integer, Long> mAddonsDownloads = new ArrayMap<Integer, Long>();
	
	public static void putAddonDownload(int key, long value) {
		Log.d("aosOTA", "Putting Addon with Key: " + key + " and Value: " + value);
		mAddonsDownloads.put(key, value);
	}
	
	public static long getAddonDownload(int key) {
		Log.d("aosOTA", "Getting Addon with Key: " + key);
		return (Long) mAddonsDownloads.get(key);
	}
	
	public static long getAddonDownloadValueAtIndex(int index) {
		return mAddonsDownloads.get(mAddonsDownloads.valueAt(index));
	}
	
	public static void removeAddonDownload(int key) {
		mAddonsDownloads.remove(key);
	}
	
	public static Set<Integer> getAddonDownloadKeySet() {
		return mAddonsDownloads.keySet();
	}
}
