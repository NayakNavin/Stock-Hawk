package rajan.udacity.stock.hawk;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import rajan.udacity.stock.hawk.data.DataManager;
import rajan.udacity.stock.hawk.ui.main.MainMvpView;
import rajan.udacity.stock.hawk.ui.main.MainPresenter;
import rajan.udacity.stock.hawk.util.RxSchedulersOverrideRule;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock MainMvpView mMockMainMvpView;
    @Mock DataManager mMockDataManager;
    private MainPresenter mMainPresenter;

    @Rule
    public final RxSchedulersOverrideRule mOverrideSchedulersRule = new RxSchedulersOverrideRule();

    @Before
    public void setUp() {
        mMainPresenter = new MainPresenter(mMockDataManager);
        mMainPresenter.attachView(mMockMainMvpView);
    }

    @After
    public void tearDown() {
        mMainPresenter.detachView();
    }

    /*@Test
    public void loadRibotsReturnsRibots() {
        List<Stock> ribots = TestDataFactory.makeListRibots(10);
        when(mMockDataManager.getStocks())
                .thenReturn(Observable.just(ribots));

        mMainPresenter.loadStocks();
        verify(mMockMainMvpView).showStocks(ribots);
        verify(mMockMainMvpView, never()).showStocksEmpty();
        verify(mMockMainMvpView, never()).showError();
    }

    @Test
    public void loadRibotsReturnsEmptyList() {
        when(mMockDataManager.getStocks())
                .thenReturn(Observable.just(Collections.<Stock>emptyList()));

        mMainPresenter.loadStocks();
        verify(mMockMainMvpView).showStocksEmpty();
        verify(mMockMainMvpView, never()).showStocks(anyListOf(Stock.class));
        verify(mMockMainMvpView, never()).showError();
    }

    @Test
    public void loadRibotsFails() {
        when(mMockDataManager.getStocks())
                .thenReturn(Observable.<List<Stock>>error(new RuntimeException()));

        mMainPresenter.loadStocks();
        verify(mMockMainMvpView).showError();
        verify(mMockMainMvpView, never()).showStocksEmpty();
        verify(mMockMainMvpView, never()).showStocks(anyListOf(Stock.class));
    }*/

}