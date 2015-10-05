package com.yan.compodroidlibrary;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Yan-Home on 5/10/2015.
 */
public interface ILifecycleDelegate {

    void onCreate(Bundle savedInstanceState);

    void onCreateOptionsMenu(Menu menu);

    void onOptionsItemSelected(MenuItem item);

    void onSaveInstanceState(final Bundle outState);
}
