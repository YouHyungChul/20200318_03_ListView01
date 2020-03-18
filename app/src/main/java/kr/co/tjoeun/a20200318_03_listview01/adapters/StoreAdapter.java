package kr.co.tjoeun.a20200318_03_listview01.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.tjoeun.a20200318_03_listview01.R;
import kr.co.tjoeun.a20200318_03_listview01.datas.Store;

//빨간줄 생기면  Alt + Enter 누르면 => 에러 해결 제안나옴
//밑에서 두번째인 context, resource, objects 파라미터가 있는걸로 골라야함.
// 각각 어느 화면, 어떤 모양, 어떤목록을 의미함
public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext; // 화면과 연결하는 연결고리
    List<Store> mList; // 뿌려줄 데이터 목록록 담고있는 변수
    LayoutInflater inf; // xml -> 객체화 시켜주는 역활 클래스

    public StoreAdapter(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);

//        생성자가 실행될대 세개의 변수를 채워줌.
        mContext = context;
        mList = objects;
//        inf는 따로 골라줘야함 .from 붙은걸로
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//           여기에서 convertView 복붙임.
        View row = convertView; // row는 지금 그려져야할 줄을 담는다.
        if(row == null){
//            기존에 그려둔게 없어서 (=null) 새로 그려야하냐??
            row = inf.inflate(R.layout.store_list_item, null);
        }
        return row;
    }
}
