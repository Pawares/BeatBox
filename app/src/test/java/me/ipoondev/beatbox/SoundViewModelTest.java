package me.ipoondev.beatbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by iPoon on 8/10/2017 AD.
 */
public class SoundViewModelTest {
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;
    @Before
    public void setUp() throws Exception {
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

    @Test
    public void exposesSoundNameAsTitle(){
        assertThat(mSubject.getTitle(), is(mSound.getName()));
    }

    @Test
    public void callBeatBoxPlayOnButtonClicked(){
        mSubject.onButtonClicked();

        verify(mBeatBox);
        mBeatBox.play(mSound);

        //verify(mBeatBox).play(mSound);

    }

}