<script setup>
import { ref } from 'vue';
import InputText from 'primevue/inputtext';
import Password from 'primevue/password';
import Button from 'primevue/button';

const username = ref('');
const password = ref('');

const login = () => {
  // Lógica de inicio de sesión aquí
  console.log('Iniciar sesión con:', username.value, password.value);
};
</script>

<!-- <template>
    <div class="login-container">
        <p class="text">Nombre</p>
        <input type="text" v-model="username">
        <p class="text">Contraseña</p>
        <input type="password" v-model="password">
        <button class="btn-login" @click="login">Iniciar sesión</button>
    </div>
        

</template> -->

<template>
    <div class="login-container">
        <div class="p-field">
            <label for="username">Usuario</label>
            <InputText v-model="username" id="username" name="username" autocomplete="username" />
        </div>
        <div class="p-field">
            <label for="password">Contraseña</label>
            <InputText v-model="password" id="password" name="password" autocomplete="current-password" />
        </div>
        <Button class="btn-login" label="Iniciar sesión" @click="login" />
    </div>
</template>

<style scoped lang="scss">

.login-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    width: 30rem;
    height: 32rem;
    margin: 1rem auto;
    padding: 40px;
    background-color: rgba(255, 249, 249, 0.95);
    font-size: 18px;
    color: rgba(12, 117, 164, 1);
    input {
        margin-bottom: 3rem;
        width: 23rem;  
        height: 2.8rem; 
        font-size: 16px;
        border-radius: 15px;
        background-color: rgba(188, 215, 224, 1);
    }
    .btn-login {
        cursor: pointer;
        width: 22rem;
        height: 3.5rem; 
        font-size: 18px;  
        border-radius: 50px;
        background-color: rgba(188, 215, 224, 1);
        border: none;
        color: rgba(12, 117, 164, 1);
    }
    .text { 
        text-align: left;
        margin-bottom: 1rem;;
    }
}

</style>

