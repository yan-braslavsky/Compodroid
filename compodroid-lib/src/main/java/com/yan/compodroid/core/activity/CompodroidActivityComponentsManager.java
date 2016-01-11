package com.yan.compodroid.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.yan.compodroid.core.CompodroidComponentManager;

import java.util.Collection;

/**
 * Created by Yan-Home on 5/10/2015.
 * Operates on {@link Activity} target object.
 * Delegates {@link Activity} lifecycle events to managed components.
 */
public class CompodroidActivityComponentsManager<A extends Activity> extends
        CompodroidComponentManager<A, CompodroidActivityComponent<A>>
        implements IActivityDelegateMethods {

    public CompodroidActivityComponentsManager(A target) {
        super(target);
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onCreate(savedInstanceState);
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onCreateOptionsMenu(final Menu menu) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onCreateOptionsMenu(menu);
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onOptionsItemSelected(final MenuItem item) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onOptionsItemSelected(item);
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onSaveInstanceState(final Bundle outState) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onSaveInstanceState(outState);
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onActivityResult(final int requestCode, final int resultCode, Intent data) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onDestroy() {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onDestroy();
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public boolean onBackPressed() {
        for (CompodroidActivityComponent component : getComponents()) {
            if (component.onBackPressed())
                return true;
        }
        return false;
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onStart() {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onStart();
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onStop() {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onStop();
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onPause() {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onPause();
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onResume() {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onResume();
        }
    }

    /**
     * Call this method from corresponding lyfecycle event of {@link Activity}
     */
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        for (CompodroidActivityComponent component : getComponents()) {
            component.onConfigurationChanged(newConfig);
        }
    }

    @Override
    protected Collection<CompodroidActivityComponent<A>> getComponents() {
        return super.getComponents();
    }
}