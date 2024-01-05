<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import DataTable from 'primevue/datatable';
import Column from 'primevue/column';

const tickets = ref([]);

onMounted(async () => {
  try {
    const response = await axios.get('http://localhost:8080/api/v1/tickets');
    tickets.value = response.data;
  } catch (error) {
    console.error('Error al obtener los tickets', error);
  }
});
</script>

<template>
    <div class="main-content">
        <DataTable :value="tickets" paginator rows="10" rowsPerPageOptions="[5,10,15]">
            <Column field="id" header="ID"></Column>
            <Column field="estado" header="Estado"></Column>
            <Column field="fecha" header="Fecha"></Column>
            <Column field="empleado" header="Empleado"></Column>
            <Column field="tema" header="Tema"></Column>          
        </DataTable>
    </div> 
  </template>
  
  <style scoped lang="scss">
  </style>