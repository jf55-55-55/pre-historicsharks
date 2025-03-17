// Function to show shark info in a modal
function showSharkInfo(name, era, info) {
  const modal = document.getElementById('shark-modal');
  const modalTitle = document.getElementById('modal-title');
  const modalEra = document.getElementById('modal-era');
  const modalInfo = document.getElementById('modal-info');

  modalTitle.textContent = name;
  modalEra.textContent = era;
  modalInfo.textContent = info;
  modal.style.display = 'flex';
}

// Function to close the modal
function closeModal() {
  const modal = document.getElementById('shark-modal');
  modal.style.display = 'none';
}

C:\Users\Kenitsu\OneDrive\myweb\