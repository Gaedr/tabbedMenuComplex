package es.gaedrspace.tabmenucomplex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Samuel on 08/08/2014.
 */
public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        if(index < 4) {
            switch(index) {
                case 0:
                    return new TranslateFragment();
                case 1:
                    return new TextFragment();
                case 2:
                    return new InfoFragment();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
