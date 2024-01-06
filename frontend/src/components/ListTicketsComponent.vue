<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import DataTable from 'primevue/datatable';
import Column from 'primevue/column';

const tickets = ref([]);

onMounted(async () => {
  try {
    const response = await axios.get('http://localhost:8080/api/v1/tickets');
    console.log(response.data);
    tickets.value = response.data;
  } catch (error) {
    console.error('Error al obtener los tickets', error);
  }
});
</script>

<template>
    <div class="main-content">
        <DataTable :value="tickets" paginator :rows="10">
            <Column field="id_ticket" header="ID"></Column>
            <Column field="status_ticket" header="Estado"></Column>
            <Column field="date_ticket" header="Fecha"></Column>
            <Column field="user_id" header="Empleado"></Column>
            <Column field="type_ticket" header="Tema"></Column>          
        </DataTable>
    </div> 
</template>
  
<style scoped lang="scss">
</style>