package maxson.com.br.maxbegin.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import maxson.com.br.maxbegin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatActionButton();
    }

    private void setupMatchesList(){
        //TODO: Listar as partidas, consumindo nossa API.
    }

    private void setupMatchesRefresh(){
        //TODO: Atualizar as partidas na ação Swipe
    }

    private void setupFloatActionButton(){
        //TODO:  Criar evento de click e simulação de partidas.
    }

}
