package kr.co.tjoeun.a20200318_03_listview01;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200318_03_listview01.adapters.StoreAdapter;
import kr.co.tjoeun.a20200318_03_listview01.databinding.ActivityMainBinding;
import kr.co.tjoeun.a20200318_03_listview01.datas.Store;

public class MainActivity extends BaseActivity {

//    가게 목록이 담길 릿트
    List<Store> storeDatas = new ArrayList<>();
//    .......
    StoreAdapter storeAdapter = null;

    ActivityMainBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {


//        어댑터를 객체화 (우리가 작성한 생성자 활용)
        storeAdapter = new StoreAdapter(mContext, R.layout.store_list_item,storeDatas);
//         리스트뷰와 어댑터를 연결
        binding.storeListView.setAdapter(storeAdapter);
        addStores();
    }

    void addStores() {
        storeDatas.add(new Store("삼겹더하기 본점", 4));
        storeDatas.add(new Store("밥해주는 남자", 3));
        storeDatas.add(new Store("굽네치킨", 4));
        storeDatas.add(new Store("BBQ", 4));
        storeDatas.add(new Store("피자헛", 2));
        storeDatas.add(new Store("도미노피자", 5));
        storeDatas.add(new Store("쓰레기", 1));
        storeDatas.add(new Store("맘스터치", 5));
        storeDatas.add(new Store("삼겹더하기 본점", 4));
        storeDatas.add(new Store("밥해주는 남자", 3));
        storeAdapter.notifyDataSetChanged();

    }
}
