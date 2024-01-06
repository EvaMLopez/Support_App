<script setup>
import { ref } from 'vue';
import InputText from 'primevue/inputtext';
import Button from 'primevue/button';

const username = ref('');
const password = ref('');

const login = () => {

  
  console.log('Iniciar sesión con:', username.value, password.value);
};
</script>

<template>
    <div class="login-container">
        <div class="p-field">
            <label for="username">Usuario<br></label><br>            
            <InputText v-model="username" id="username" name="username" autocomplete="username" />
            <br>
        </div>
        <div class="p-field">
            <label for="password">Contraseña <br></label> <br>
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
    @media (max-width: 767px) {
        width: 26rem;
        height: 29rem;
        margin: 1rem auto;
        padding: 40px;
        background-color: rgba(255, 249, 249, 0.95);
        font-size: 16px;
    }

    input {
        margin-bottom: 3rem;
        width: 23rem;  
        height: 2.8rem; 
        font-size: 16px;
        border-radius: 15px;
        background-color: rgba(188, 215, 224, 1);
        @media (max-width: 767px) {
            margin-bottom: 2.5rem;
            width: 20rem;  
            height: 2.8rem; 
            font-size: 16px;
        }
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
        @media (max-width: 767px) {
            width: 18rem;
            height: 3rem; 
            font-size: 16px;  
        }
    }
}

</style>

