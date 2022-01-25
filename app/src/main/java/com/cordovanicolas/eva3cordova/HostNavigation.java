package com.cordovanicolas.eva3cordova;

import androidx.fragment.app.Fragment;


public interface HostNavigation {
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
