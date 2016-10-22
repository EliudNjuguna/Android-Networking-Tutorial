package com.raywenderlich.reposearch;

import java.util.ArrayList;

/**
 * Created by eliud on 10/22/16.
 */

public interface DownloadCompleteListener {

    void downloadComplete(ArrayList<Repository> repositories);
}
