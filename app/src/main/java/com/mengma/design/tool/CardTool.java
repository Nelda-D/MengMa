package com.mengma.design.tool;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.CardProvider;
import com.dexafree.materialList.card.OnActionClickListener;
import com.dexafree.materialList.card.action.TextViewAction;
import com.mengma.design.R;

/**
 * Created by Administrator on 2017/6/22.
 */

public class CardTool {

    public static Card getTestCard1(final Context context){
        Card card = new Card.Builder(context)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_image_with_buttons_card)
                .setTitle("Card number 5")
                .setDescription("Lorem ipsum dolor sit amet")
                .setDrawable(R.mipmap.p7)
                .addAction(R.id.left_text_button, new TextViewAction(context)
                        .setText("Izquierda")
                        .setTextResourceColor(R.color.black_button)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Log.d("ADDING", "CARD");
                                Toast.makeText(context, "Added new card", Toast.LENGTH_SHORT).show();
                            }
                        }))
                .addAction(R.id.right_text_button, new TextViewAction(context)
                        .setText("Derecha")
                        .setTextResourceColor(R.color.accent_material_dark)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Toast.makeText(context, "You have pressed the right button", Toast.LENGTH_SHORT).show();
                            }
                        }))
                .endConfig()
                .build();
        return card;
    }


    public static Card getTestCard2(final Context context){
        Card card = new Card.Builder(context)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_normal_card_layout)
                .setTitle("Card number 5")
                .setDescription("Lorem ipsum dolor sit amet")
                .setDrawable(R.mipmap.table)
                .addAction(R.id.left_text_button, new TextViewAction(context)
                        .setText("Izquierda")
                        .setTextResourceColor(R.color.black_button)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Log.d("ADDING", "CARD");
                                Toast.makeText(context, "Added new card", Toast.LENGTH_SHORT).show();
                            }
                        }))
                .addAction(R.id.right_text_button, new TextViewAction(context)
                        .setText("Derecha")
                        .setTextResourceColor(R.color.accent_material_dark)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Toast.makeText(context, "You have pressed the right button", Toast.LENGTH_SHORT).show();
                            }
                        }))
                .endConfig()
                .build();
        return card;
    }
}
